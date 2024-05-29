const btn = document.getElementById('sign-btn');

btn.addEventListener('click', function(e) {
    e.preventDefault();

    const email = document.getElementById('email');
    const password = document.getElementById('password');
    const formData = new FormData();
    formData.append("email", email.value);
    formData.append("password", password.value);
    const jsonData = {}
    for (const [name, value] of formData) {
        jsonData[name] = value;
    }
    const url = "/sign-in";
    fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(jsonData),
    }).then((res) => {
        return res.json(); //Promise 반환
    }).then((json) => {
            console.log(json);
        });

})