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
    <body>
        <header role="banner">
            <div id="cd-logo"><a href="#0"><img src="img/logo.png" alt="Logo"></a></div>

            <nav class="main-nav">
                <ul>
                    <li><a class="cd-signin" href="#0">Вход</a></li>
                    <li><a class="cd-signup" href="#0">Регистрация</a></li>
                </ul>
            </nav>
            <nav class="name">
                <h3>ContactMe</h3>
            </nav>
        </header>

        <div class="cd-user-modal"> <!-- все формы на фоне затемнения-->
            <div class="cd-user-modal-container"> <!-- основной контейнер -->
                <ul class="cd-switcher">
                    <li><a href="#0">Вход</a></li>
                    <li><a href="#0">Регистрация</a></li>
                </ul>

                <div id="cd-login"> <!-- форма входа -->
                    <form class="cd-form"  method="POST" action="doLogin">
                        <p class="fieldset">
                            <label class="image-replace cd-email"  for="signin-email">Логин</label>
                            <input class="full-width has-padding has-border" name="userName" id="signin-email" type="text" placeholder="E-mail">
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-password" for="signin-password">Пароль</label>
                            <input class="full-width has-padding has-border" name="password" id="signin-password" type="text"  placeholder="Пароль">
                            <a href="#0" class="hide-password">Скрыть</a>
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <input type="checkbox" name="rememberMe" value= "Y" id="remember-me" checked>
                            <label for="remember-me">Запомнить меня</label>
                        </p>

                        <p class="fieldset">
                            <input class="full-width" type="submit" value="Войти">
                        </p>
                    </form>

                    <p class="cd-form-bottom-message"><a href="#0">Забыли свой пароль?</a></p>
                    <!-- <a href="#0" class="cd-close-form">Close</a> -->
                </div> <!-- cd-login -->

                <div id="cd-signup"> <!-- форма регистрации -->
                    <form class="cd-form">
                        <p class="fieldset">
                            <label class="image-replace cd-username" for="signup-username">Имя пользователя(логин)</label>
                            <input class="full-width has-padding has-border" id="signup-username" type="text" placeholder="Имя пользователя">
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-email" for="signup-email">Телефон</label>
                            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="Телефон">
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <label class="image-replace cd-password" for="signup-password">Пароль</label>
                            <input class="full-width has-padding has-border" id="signup-password" type="text"  placeholder="Пароль">
                            <a href="#0" class="hide-password">Скрыть</a>
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <input class="full-width has-padding" type="submit" value="Создать аккаунт">
                        </p>
                    </form>

                    <!-- <a href="#0" class="cd-close-form">Close</a> -->
                </div> <!-- cd-signup -->
                
                <div id="cd-reset-password"> <!-- форма восстановления пароля -->
                    <p class="cd-form-message">Забыли пароль? Пожалуйста, введите адрес своей электронной почты. Вы получите ссылку, чтобы создать новый пароль.</p>

                    <form class="cd-form">
                        <p class="fieldset">
                            <label class="image-replace cd-email" for="reset-email">E-mail</label>
                            <input class="full-width has-padding has-border" id="reset-email" type="email" placeholder="E-mail">
                            <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                        </p>

                        <p class="fieldset">
                            <input class="full-width has-padding" type="submit" value="Восстановить пароль">
                        </p>
                    </form>

                    <p class="cd-form-bottom-message"><a href="#0">Вернуться к входу</a></p>
                </div> <!-- cd-reset-password -->
                <a href="#0" class="cd-close-form">Закрыть</a>
            </div> <!-- cd-user-modal-container -->
        </div> <!-- cd-user-modal -->
        <div id="agree-file">
                    <h1>Соглашение об обработке персональных данных</h1>
                    <p>Настоящее пользовательское соглашение является публичной офертой (то есть предложением заключить соглашение).</p><p>Нажимая кнопки «Получить коммерческое предложение», «Зарегистрироваться», «Отправить заявку», «Отправить сообщение», «Заказать обратный звонок» и другие кнопки для отправки данных форм, Вы считаетесь присоединившимся к нему.</p><h3>Соглашение об обработке персональных данных</h3><p>При изменении законодательства, Соглашение может подвергаться изменениям.</p><h3>1. Термины, применяемые в настоящем Соглашении:</h3><p>1.1. Сайт – это совокупность текстов, графических элементов, дизайна, изображений, программного кода, фото- и видеоматериалов и иных результатов интеллектуальной деятельности, содержащихся в сети Интернет под доменным именем http://newbeautytech.ru.</p><p>1.2. Администрация Сайта – это лицо, обладающее правами администрирования Сайта.</p><p>1.3. Пользователь – это любое лицо, осуществившее вход на Сайт и принявшее условия настоящего Соглашения, независимо от факта прохождения процедур регистрации и авторизации.</p><h3>2. Использование персональных данных</h3><p>2.1. Принимая условия настоящего соглашения, Пользователь предоставляет Администрации Сайта согласие на обработку своих персональных данных.</p><p>2.2. Цель обработки персональных данных: выполнение Администрацией обязательств перед Пользователем в рамках настоящего Соглашения, продвижение товаров и услуг, клиентская поддержка.</p><p>2.3. Обработке подлежат следующие персональные данные:</p><p>2.3.1. Фамилия, имя, отчество Пользователя;</p><p>2.3.2. Электронный адрес Пользователя;</p><p>2.3.3. Номер телефона Пользователя.</p><p>2.4. Под обработкой персональных данных подразумевается следующий перечень действий с персональными данными: сбор, запись, систематизация, накопление, хранение, уточнение (обновление, изменение), извлечение, использование, передачу (распространение, предоставление доступа), обезличивание, блокирование, удаление, уничтожение персональных данных.</p><p>2.5. Персональные данные получаются в связи с заключением договора, стороной которого является субъект персональных данных. Персональные данные не распространяются, а также не предоставляются третьим лицам без согласия субъекта персональных данных и используются оператором исключительно для исполнения указанного соглашения и заключения договоров с субъектом персональных данных.</p><p>2.6. Администрация имеет право отправлять информационные, в том числе рекламные сообщения, на электронную почту и мобильный телефон Пользователя с его согласия, выраженного посредством совершения им действий, однозначно идентифицирующих этого абонента и позволяющих достоверно установить его волеизъявление на получение сообщения. Пользователь вправе отказаться от получения рекламной и другой информации без объяснения причин отказа путем информирования Администрации о своем отказе по любому телефону, указанному на Сайте, либо посредством направления соответствующего заявления на любой электронный адрес, указанный на Сайте. Сервисные сообщения, информирующие Пользователя о заказе и этапах его обработки, отправляются автоматически и не могут быть отклонены Пользователем.</p><p>2.7. Данное согласие на обработку персональных данных действует бессрочно, но может быть отозвано субъектом персональных данных на основании личного заявления, направленного по электронной почте Администрации Сайта.</p><p>2.8. Администрация Сайта обязуется использовать персональные данные Пользователя, полученные в результате использования Сайта в соответствии с требованиями законодательства о защите персональных данных, в том числе федерального закона № 152-ФЗ от 22.02.2017 «О персональных данных» в редакции, действующей на момент обработки таких персональных данных.</p>       
                </div>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/main.js"></script> <!-- Gem jQuery -->
    </body>
</html>
