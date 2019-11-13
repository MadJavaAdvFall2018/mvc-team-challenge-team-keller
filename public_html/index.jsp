<!doctype html>
<html>
<head>
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <div class="wrapper">
        <h1>Igpay Atinlay</h1>

        <form method="get" action="/java112/pigLatin">
            <label>Text to be translated:</label><br>
            <textarea name="text"></textarea><br>
            <input type="submit" value="Submit">
        </form>

        <h2>Translated result:</h2>
        <p>${pigLatin.translation}</p>
    </div>
</body>
</html>
