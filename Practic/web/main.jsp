<%-- 
    Document   : index
    Created on : 14.07.2017, 16:38:08
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ContactMe</title>
        <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
        <link rel="stylesheet" href="css/style.css"> <!-- Gem style -->
        <script src="js/modernizr.js"></script> <!-- Modernizr -->

    </head>
    <body style="background-color: black;">
        <header role="banner">
            <nav class="main-nav">
                <ul>
                    <li><a class="cd-signin" href="#0">Выход</a></li>
                    <li><a class="cd-signup" href="#0">Создать контакт</a></li>
                </ul>
            </nav>
            <nav class="name">
                <h3>ContactMe</h3>
            </nav>
        </header>

        <div class="cd-user-modal"> <!-- все формы на фоне затемнения-->
            <div class="cd-user-modal-container"> <!-- основной контейнер -->
                <div id="cd-signup"> 
                    <form class="cd-form">
                        <p class="fieldset">
                            <label class="image-replace cd-username" for="signup-username">Имя</label>
                            <input class="full-width has-padding has-border" id="signup-username" type="text" placeholder="Имя пользователя">
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Фамилия</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Фамилия">
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Отчество</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Отчество">
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Псевдоним</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Псевдоним">
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Телефон</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Телефон">
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">E-mail</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="E-mail">
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Ссылка на соц.сеть</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Ссылка на соц.сеть">
                            
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Примечание</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Примечание">
                        </p>


                        <p class="fieldset">
                            <input class="full-width has-padding" type="submit" value="Создать">
                        </p>
                    </form>

                </div> 
                
                <a href="#0" class="cd-close-form">Закрыть</a>
            </div> <!-- cd-user-modal-container -->
        </div> <!-- cd-user-modal -->
        
        <iframe id="contacts" src="search.jsp">Обновите браузер</iframe>
        <iframe id="contact-info">Обновите браузер</iframe>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/main.js"></script> <!-- Gem jQuery -->
    </body>
</html>
