<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<!DOCTYPE html>
<html>
    <head>
        <title>Reo's Portfolio</title>
        <meta charset="utf-8">
        <link rel="Stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
        <script src="${pageContext.request.contextPath}/js/contact.js"></script>
    </head>
    <body>
        <!-- ヘッダー -->
        <div id="header">
            <header>
                <!-- PC用ナビゲーション -->
                <nav id="nav-pc">
                    <a href="http://localhost:8080/Portfolio/introduction">Introduction</a>
                    <a href="http://localhost:8080/Portfolio/portfolio">Portfolio</a>
                    <a href="http://localhost:8080/Portfolio/contact">Contact</a>
                </nav>
            </header>
            
            <!--見出し-->
            <div id="headline">
                <h1>Contact</h1>
            </div>
        </div>
        <main>
            <article>
                <section id="contact">
                    <h2 class="small-title">お問い合わせ</h2>
                    <form  name="contactform" action="./contactresult" method="post">   
                        <div>
                            <div>
                                <label id="contact-label">お名前</label>
                            </div>
                            <div>
                                <input type="text" name="name" placeholder="入力してください" id="contact-textbox">
                            </div>
                            <div>
                                <label id="contact-label">メールアドレス</label>
                            </div>
                            <div>
                                <input type="text" name="mail" placeholder="入力してください" id="contact-textbox">
                            </div>
                            <div>
                                <label id="contact-label">電話番号</label>
                            </div>
                            <div>
                                <input type="text" name="tel" placeholder="入力してください"  id="contact-textbox">
                            </div>
                        </div>
                        <div>
                            <div>
                                <label id="contact-label">お問い合わせ内容</label>
                            </div>
                            <div>
                                <textarea id="contact-textarea" placeholder="入力してください" name="inquiry"></textarea>
                            </div>
                        </div>
                        <div>
                            <div>
                                <label id="contact-label">ご連絡方法</label>
                            </div>
                            <div>
                              <input class="radiobutton" type="radio" value="1" name="method" checked><label>1.お電話</label>
                              <input class="radiobutton" type="radio" value="2" name="method"><label>2.メール</label>
                              <input class="radiobutton" type="radio" value="3" name="method"><label>3.どちらでも</label>
                            </div>
                        </div>
                        <div>
                            <input class="submitbtn" type="button" onclick="contact()" value="送信する">
                        </div>
                    </form>
                </section>
            </article>
            <footer>
                <div id="footer-link">
                    <a href="http://localhost:8080/Portfolio/introduction">Introduction</a>
                    <a href="http://localhost:8080/Portfolio/portfolio">Portfolio</a>
                    <a href="http://localhost:8080/Portfolio/contact">Contact</a>
                </div>
                <span id="copylight">&copy;2022 M Reo All Rights Reserved.</span>
            </footer>
        </main>
    </body>
</html>