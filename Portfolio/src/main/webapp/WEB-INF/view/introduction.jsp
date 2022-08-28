<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reo's Portfolio</title>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
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
                <h1>Introduction</h1>
            </div>
        </div>
        <main>
            <article>

                <!-- introduction メイン -->
                <section id="introduction">
                	<h2 class="small-title">自己紹介</h2>
                		<img id="introduction-image" src="${pageContext.request.contextPath}/imgs/icon.jpg">
                		<h2>Reo</h2>
                		<div id="introduction-frame">
                			<ul id="intro-ul">
                				<li class="intro-li">2003/01/07生まれ 19歳</li>
                				<li class="intro-li">音楽・読書・ゲーム・アニメが好き</li>
                				<li class="intro-li">姉と弟がいる3人兄弟の2番目</li>
                				<li class="intro-li">現在SAMURAI ENGINEERを卒業、就活の準備しながらプログラミングを学習中</li>
                			</ul>
                		</div>
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