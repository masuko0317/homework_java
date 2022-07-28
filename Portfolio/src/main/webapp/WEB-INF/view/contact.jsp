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
                    <form action="./contactresult" method="post">   
                        <div>
                            <div id="contact-heading">
                                <label class="contact-label">お名前</label>
                            </div>
                            <div class="contact-form">
                                <input type="text" name="name" placeholder="入力してください" class="contact-textbox">
                            </div>
                            <div id="contact-heading">
                                <label class="contact-label">メールアドレス</label>
                            </div>
                            <div>
                                <input type="text" name="mail" placeholder="入力してください" class="contact-textbox">
                            </div>
                            <div class="contact-heading">
                                <label class="contact-label">電話番号</label>
                            </div>
                            <div>
                                <input type="text" name="tel" placeholder="入力してください" class="contact-textbox">
                            </div>
                        </div>
                        <div>
                            <div class="contact-heading">
                                <label class="contact-label">お問い合わせ内容</label>
                            </div>
                            <div>
                                <textarea class="contact-textarea" placeholder="入力してください" name="inquiry"></textarea>
                            </div>
                        </div>
                        <div>
                            <div class="contact-heading">
                                <label class="contact-label">ご連絡方法</label>
                            </div>
                            <div>
                              <input class="radiobutton" type="radio" value="1" name="method" checked><label>お電話</label>
                              <input class="radiobutton" type="radio" value="2" name="method"><label>メール</label>
                              <input class="radiobutton" type="radio" value="3" name="method"><label>どちらでも</label>
                            </div>
                        </div>
                            <input  id="submit-btn" type="button" onclick="contact()" alt="送信する">
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