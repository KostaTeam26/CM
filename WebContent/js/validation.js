function nameCheck() { // 이름 유효성 검사

	var name = document.getElementById('username');
	var filter = /^[가-힝]{2,15}$/;
	var message = document.getElementById('nameMessage');
	var badColor = "#ff6666";
	var goodColor = "#66cc66";

	if (!filter.test(name.value)) {

		message.style.color = badColor;
		message.innerHTML = "이름이 이상한데요";

	}

	else {

		message.style.color = goodColor;
		message.innerHTML = "올바른 이름이네요";
	}

}

function emailCheck() { // 이메일 유효성 검사

	var email = document.getElementById('InputEmail');
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	var message = document.getElementById('emailMessage');
	var badColor = "#ff6666";
	var goodColor = "#66cc66";

	if (!filter.test(email.value)) {

		message.style.color = badColor;
		message.innerHTML = "잘못된 이메일 형식입니다";

		return false;
	} else {
		message.style.color = goodColor;
		message.innerHTML = "올바른 이메일 형식입니다";
	}
}

function checkPass() {
	var pass1 = document.getElementById('InputPassword1');
	var pass2 = document.getElementById('InputPassword2');
	var badColor = "#ff6666";
	var goodColor = "#66cc66";
	var message = document.getElementById('numberMessage');
	var message2 = document.getElementById('confirmMessage');

	var blank_pattern = /[\s]/g;

	// if( blank_pattern.test(pass1) == true){
	// alert(' 공백은 사용할 수 없습니다. ');
	// return false;
	// }

	// if(pass1.value==""){
	//		
	// message1.style.color = badColor;
	// message1.innerHTML = "비밀번호를 입력해주세요"
	//		
	// }
	//	
	// if(pass2.value==""){
	//		
	// message2.style.color = badColor;
	// message2.innerHTML = "비밀번호를 입력해주세요"
	//		
	// }

	if (pass1.value.length > 0 && pass1.value.length < 5) {

		message.style.color = badColor;
		message.innerHTML = "비밀번호는 5자이상입니다";

		return false;
	}

	else if (pass1.value.length >= 5) {

		message.style.color = goodColor;
		message.innerHTML = "충분한 비밀번호입니다";
		
	
	}

	
	
	
	
	
	if (!pass1.value.match(/^[a-zA-Z0-9!@.#$%^&*?_~]{5,}$/)) { // 비밀번호 공백 포함 불가

		message.style.color = badColor;
		message.innerHTML = "비밀번호에 공백이 포함되어있습니다";

		return false;
	}

	if (pass1.value == pass2.value) {
		// The passwords match.
		// Set the color to the good color and inform
		// the user that they have entered the correct password
		pass2.style.backgroundColor = goodColor;
		message2.style.color = goodColor;
		message2.innerHTML = "비밀번호가 일치합니다."

		
	} else {
		// The passwords do not match.
		// Set the color to the bad color and
		// notify the user.
		pass2.style.backgroundColor = badColor;
		message2.style.color = badColor;
		message2.innerHTML = "비밀번호가 일치하지 않습니다. 다시 입력해주세요"

		
	}

}

// function checkPass() {
// // Store the password field objects into variables ...
// var pass1 = document.getElementById('InputPassword1');
// var pass2 = document.getElementById('InputPassword2');
// // Store the Confimation Message Object ...
// var message = document.getElementById('confirmMessage');
// // Set the colors we will be using ...
// var goodColor = "#66cc66";
// var badColor = "#ff6666";
// // Compare the values in the password field
// // and the confirmation field
// if (pass1.value == pass2.value) {
// // The passwords match.
// // Set the color to the good color and inform
// // the user that they have entered the correct password
// pass2.style.backgroundColor = goodColor;
// message.style.color = goodColor;
// message.innerHTML = "비밀번호가 일치합니다."
// } else {
// // The passwords do not match.
// // Set the color to the bad color and
// // notify the user.
// pass2.style.backgroundColor = badColor;
// message.style.color = badColor;
// message.innerHTML = "비밀번호가 일치하지 않습니다. 다시 입력해주세요"
// }
// }
