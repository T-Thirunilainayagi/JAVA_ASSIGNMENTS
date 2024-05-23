function signIn() {
    var email = document.getElementById('email').value.trim();
    var password = document.getElementById('password').value;
 
    var emailError = document.getElementById('emailError');
    var passwordError = document.getElementById('passwordError');

    let isLoggedIn;
 
    // Reset error messages
    emailError.textContent = '';
    passwordError.textContent = '';
 
    // Retrieve user data from local storage
    var userData = localStorage.getItem('user');
    if (userData) {
      var user = JSON.parse(userData);
      // Check if entered credentials match
      if (user.email === email && user.password === password) {
        // Sign in successful
        document.getElementById('successMessage').style.display = 'block';
        //localStorage.setItem ('isLoggedIn',true)
        window.location.href="../HTML/successpage.html"

        return false; // Prevent form submission
      } else {
        // Incorrect credentials
        emailError.textContent = 'Incorrect email or password';
        return false; // Prevent form submission
      }
    } else {
      // No user data found
      emailError.textContent = 'No user found with this email';
      return false; // Prevent form submission
    }

    // if(isLoggedIn){
    //     window.location.href="../HTML/successpage.html"
    // }
  }