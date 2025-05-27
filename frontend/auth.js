// Signup Handler
document.getElementById('signup-form')?.addEventListener('submit', function (e) {
  e.preventDefault();

  const name = document.getElementById('name').value.trim();
  const email = document.getElementById('email').value.trim().toLowerCase();
  const password = document.getElementById('password').value;
  const confirmPassword = document.getElementById('confirm-password').value;

  if (password !== confirmPassword) {
    alert("Passwords do not match.");
    return;
  }

  if (localStorage.getItem(email)) {
    alert("User already exists with this email.");
    return;
  }

  const user = { name, email, password , score: 0};
  localStorage.setItem(email, JSON.stringify(user));
  alert("Account created successfully!");
  window.location.href = "login.html";
});

// Login Handler
document.getElementById('login-form')?.addEventListener('submit', function (e) {
  e.preventDefault();

  const email = document.getElementById('login-email').value.trim().toLowerCase();
  const password = document.getElementById('login-password').value;

  const user = JSON.parse(localStorage.getItem(email));
  if (!user) {
    alert("No account found with this email.");
  } else if (user.password !== password) {
    alert("Incorrect password.");
  } else {
    alert(`Welcome, ${user.name}!`);
    localStorage.setItem("currentUser", JSON.stringify(user)); // Save full user object
    window.location.href = "dashboard.html";
  }
});
