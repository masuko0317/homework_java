/**
 * 
 */
  const submitBtn = document.getElementById('submit-btn');

submitBtn.addEventListener('click',() => {
    const text = document.forms.textBox.name.value;
    const text2 = document.forms.textBox.email.value;
    const text3 = document.forms.textBox.tel.value;
    const text4 = document.forms.textBox.inquiry.value;

    if(text=="") {
        alert("名前を入力してください");
      }
    else if (text2=="") {
        alert("メールアドレスを入力してください")
    }
    else if (text3=="") {
        alert("電話番号を入力してください")
    }
    else if(text4=="") {
        alert("お問い合わせ内容を入力してください")
    }
    else{
		document.contactform.submit();
	}
}
);