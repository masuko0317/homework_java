<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reo's Portfolio</title>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="Portfolio/src/main/css/style.css">
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
                    <h2 class="h2">お問い合わせ</h2>
                    <form>   
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
                                <input type="text" name="email" placeholder="入力してください" class="contact-textbox">
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
                                <textarea class="contact-textarea" placeholder="入力してください" name="message"></textarea>
                            </div>
                        </div>
                        <div>
                            <div class="contact-heading">
                                <label class="contact-label">ご連絡方法</label>
                            </div>
                            <div>
                              <input class="radiobutton" type="radio" value="tel" name="contact" checked><label>お電話</label>
                              <input class="radiobutton" type="radio" value="mail" name="contact"><label>メール</label>
                              <input class="radiobutton" type="radio" value="both" name="contact"><label>どちらでも</label>
                            </div>
                        </div>
                            <input type="image" value="Submit" src="" alt="送信する">
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