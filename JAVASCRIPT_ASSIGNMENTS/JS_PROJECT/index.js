function addCustomerData(){

    //fetching form and table elements contents
    const form = document.getElementById("customer_form");
    const tableBody = document.getElementById("customer_data_table_body");
    form.addEventListener("submit", (e) => {
        e.preventDefault();

        //fetching form data and storing in variables
        const name = document.getElementById("uname").value;
        const email = document.getElementById("email").value;
        const contact_num = document.getElementById("cnumber").value;
        const account_type = document.getElementById("accountType").value;

        //validation part

        //name validation
        const name_regex =  /^[a-zA-Z]+$/;
        let valid_name;
        if(name_regex.test(name))
             valid_name=name;
        else
           alert("Only letters are allowed in Name field")

        //email validation
        const email_regex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        let valid_email;
        if(email_regex.test(email))
            valid_email=email;
        else
          alert("Please provide valid email id")


        //mobile number validation
        const mobile_regex=/^[7-9]\d{9}$/;
        let valid_mobile;
        if(mobile_regex.test(contact_num))
            valid_mobile=contact_num;
        else
          alert("Please provide valid Mobile number")

        //account type validation
        let account_type_ind =document.getElementById("accountType");
        let account_type_index = account_type_ind.options[account_type_ind.selectedIndex].value;
        if (account_type_index === "") 
           alert("Please select your account type.");
    

        //storing all form elements in an array object
        const objArray=[valid_name,valid_email,valid_mobile,account_type];
        console.log(objArray);

        // Create a new row in the table to display dynamic data
        const newRow = document.createElement("tr");
        newRow.innerHTML = `
            <td>${valid_name}</td>
            <td>${valid_email}</td>
            <td>${valid_mobile}</td>
            <td>${account_type}</td>
        `;
        tableBody.appendChild(newRow);

        // Clear form inputs on every button click
        form.reset();
    });
    
}