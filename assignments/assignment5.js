
        function validate() {
            let username = document.getElementById("username").value;
            let password = document.getElementById("password").value;
            if (username == null || username == "" ) {
                alert("Please enter the username.");
                return false;
            }
            if (password == null || password == "") {
                alert("Please enter the password.");
                return false;
            }
           
            alert('Login successful');
            
        } 