function signup() {
    var name = document.getElementById('name').value.trim();
    var email = document.getElementById('email').value.trim();
    var password = document.getElementById('password').value;
 
    var nameError = document.getElementById('nameError');
    var emailError = document.getElementById('emailError');
    var passwordError = document.getElementById('passwordError');
 
    // Reset error messages
    nameError.textContent = '';
    emailError.textContent = '';
    passwordError.textContent = '';
 
    // Validation
    var valid = true;
    if (!name) {
      nameError.textContent = 'Please enter your name';
      valid = false;
    }
    if (!email) {
      emailError.textContent = 'Please enter your email';
      valid = false;
    }
    if (!password) {
      passwordError.textContent = 'Please enter your password';
      valid = false;
    } else if (password.length < 8) {
      passwordError.textContent = 'Password must have at least 8 characters';
      valid = false;
    }
 
    if (valid) {
      // Create user object
      var user = {
        name: name,
        email: email,
        password: password
      };
 
      // Store user object in local storage
      localStorage.setItem('user', JSON.stringify(user));
 
      // Inform user and clear form
      document.getElementById('signupForm').reset();
      document.getElementById('successMessage').style.display = 'block';
      alert("User registered successfully ")
      window.location.href="../HTML/signin.html"
    }
  }