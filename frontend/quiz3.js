// Retrieve quiz category and number of questions from localStorage
let quizCategory = localStorage.getItem("quizCategory") || "Array";
let questionCount = parseInt(localStorage.getItem("numQuestion")) || 5;

let quizQuestions = [];
let currentQuestion = 0;
let timer = null;
let timeLeft = 30;
let userSelectedAnswers = [];
let questionStartTime = 0;
let questionTimes = [];

// Display selected topic on the page
document.getElementById("quiz-topic").innerText = `Topic: ${quizCategory}`;

// Fetch questions from the JSON file
fetch('newques.json')
    .then(response => {
        if (!response.ok) throw new Error('Failed to load questions.json');
        return response.json();
    })
    .then(data => {
        if (!data[quizCategory]) {
            alert("Invalid quiz category!");
            return;
        }

        quizQuestions = data[quizCategory].slice(0, questionCount);
        userSelectedAnswers = new Array(quizQuestions.length).fill(null);
        questionTimes = new Array(quizQuestions.length).fill(0);
        loadQuestion();
    })
    .catch(error => {
        console.error('Error loading questions:', error);
        alert("Could not load questions. Please try again later.");
    });

// Load and display the current question
function loadQuestion() {
    clearInterval(timer);

    // If all questions are done, go to result
    if (currentQuestion >= quizQuestions.length) {
        let score = 0;
        for (let i = 0; i < quizQuestions.length; i++) {
            if (userSelectedAnswers[i] === quizQuestions[i].answer) score++;
        }

        const quizResult = {
            score: score,
            total: quizQuestions.length,
            questions: quizQuestions.map((q, idx) => ({
                question: q.question,
                correct: q.answer,
                selected: userSelectedAnswers[idx],
                timeTaken: questionTimes[idx] || 0,
                difficulty: q.difficulty || 3
            }))
        };

        // Save result in user history and update best/latest scores
        const currentUser = JSON.parse(localStorage.getItem("currentUser"));
        if (currentUser && currentUser.email) {
            const email = currentUser.email;
            let storedUser = JSON.parse(localStorage.getItem(email)) || currentUser;

            if (!storedUser.scores) {
                storedUser.scores = [];
            }

            // Add current quiz result to scores array
            storedUser.scores.push({
                topic: quizCategory,
                score: score,
                total: quizQuestions.length,
                date: new Date().toLocaleString()
            });

            // Calculate percentage of this quiz
            const currentPercent = (score / quizQuestions.length) * 100;

            // Update bestScore if this quiz is better
            if (!storedUser.bestScore || currentPercent > storedUser.bestScore) {
                storedUser.bestScore = currentPercent;
            }

            // Always update latestScore with current quiz percent
            storedUser.latestScore = currentPercent;

            // Save updated user back to localStorage (email key and session)
            localStorage.setItem(email, JSON.stringify(storedUser));
            localStorage.setItem("currentUser", JSON.stringify(storedUser));
        }

        // Store result separately for result page
        localStorage.setItem("quizResult", JSON.stringify(quizResult));
        window.location.href = "result.html";

        return;
    }

    const q = quizQuestions[currentQuestion];
    document.getElementById("question-text").innerText = q.question;

    const optionsContainer = document.getElementById("options-container");
    optionsContainer.innerHTML = "";

    q.options.forEach(option => {
        const btn = document.createElement("button");
        btn.innerText = option;
        btn.classList.add("option-btn");

        if (userSelectedAnswers[currentQuestion] === option) {
            btn.classList.add("selected");
        }

        btn.onclick = () => {
            const allButtons = document.querySelectorAll(".option-btn");
            allButtons.forEach(b => {
                b.disabled = true;
                b.classList.remove("selected");
            });

            userSelectedAnswers[currentQuestion] = option;
            const correctAnswer = q.answer;

            const timeTaken = Math.floor((Date.now() - questionStartTime) / 1000);
            questionTimes[currentQuestion] = timeTaken;

            if (option === correctAnswer) {
                btn.classList.add("correct");
            } else {
                btn.classList.add("wrong");
                allButtons.forEach(b => {
                    if (b.innerText === correctAnswer) {
                        b.classList.add("correct");
                    }
                });
            }

            document.getElementById("next-btn").disabled = false;
            clearInterval(timer);
        };

        optionsContainer.appendChild(btn);
    });

    // Timer and next button logic
    timeLeft = 30;
    document.getElementById("timer").innerText = `Time Left: ${timeLeft}s`;

    if (userSelectedAnswers[currentQuestion] === null) {
        startTimer();
        document.getElementById("next-btn").disabled = true;
    } else {
        document.getElementById("next-btn").disabled = false;
    }

    questionStartTime = Date.now(); // start time tracking
}

// Timer function
function startTimer() {
    timer = setInterval(() => {
        timeLeft--;
        document.getElementById("timer").innerText = `Time Left: ${timeLeft}s`;

        if (timeLeft <= 0) {
            clearInterval(timer);
            document.getElementById("timer").innerText = "Time's up!";
            if (userSelectedAnswers[currentQuestion] === null) {
                userSelectedAnswers[currentQuestion] = null;
                const timeTaken = Math.floor((Date.now() - questionStartTime) / 1000);
                questionTimes[currentQuestion] = timeTaken;
            }
            document.getElementById("next-btn").disabled = false;
        }
    }, 1000);
}

// Move to next question
document.getElementById("next-btn").addEventListener("click", () => {
    currentQuestion++;
    loadQuestion();
});
