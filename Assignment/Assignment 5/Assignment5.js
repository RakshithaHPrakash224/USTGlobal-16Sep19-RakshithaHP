function Toggle() { 
    var temp = document.getElementById("password"); 
    if (temp.type === "password") { 
        temp.type = "text"; 
    } 
    else { 
        temp.type = "password"; 
    } 
}


function check(idlenth, passlenth) {
    let id=idlenth.value
    let pass=passlenth.value
    if(id.length<5||pass.length<6)
    alert(" you have to enter at least 6 digit!")
}