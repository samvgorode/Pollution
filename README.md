# Pollution
pollution etc
Вам потрібно буде написати додаток для відображення атмосферного
забруднення. А саме:
● Окис вуглец ​ю ​( ​CO) ​;
● Озон ​ ​( ​O3);
● Діоксид сірки ​(SO2);
● Діоксид азо ​ ту ​( ​NO2);
Додаток повинен складатися з 5-ти екранів. Перший екран це довільне меню.
Вітається ​Material Design ​. Меню повинне мати 4 пунктів (Окис вуглецю, Озон, Діоксид
сірки, Діоксид азоту). Натиснувши на відповідне меню відкривається детальний опис
забруднення місцевості. Дані беремо з ​API Open Weather Map ​. Для початку треба
отримати ​ ​API_KEY (Особисто я з генерував і користувався наступним ключем -
23976f6598cd880e93af88300aab465d ​). ​На даний момент API знаходиться в беті і мені
не вдалося отримати атмосферне забруднення Ужгорода ​("latitude":48.6215,
"longitude":22.2788)
​ ​ Тому використовуємо тестові значення геолокації та дати.
1. API Carbon Monoxide (CO)
GET/
http://api.openweathermap.org/pollution/v1/co/0.0,10.0/2016Z.json?appid={api_key}
{
"time": "2016-12-09T01:04:03Z",
"location": {
"latitude": 0,
"longitude": 9.9743
},
"data": [
{
"precision": -0.0000004999999987376214,
"pressure": 1000,
"value": 0.00000009076558171727811
},
{
"precision": -0.0000004999999987376214,
"pressure": 681.2920532226562,
"value": 0.00000010878591183427488
]
}

2. API Ozone (O3)
GET/
http://api.openweathermap.org/pollution/v1/o3/0.0,10.0/2016-01-02T15:04:05Z.json?ap
pid={api_key}
{
"time": "2016-03-03T12:00:00Z",
"location": {
"latitude": 0.0,
"longitude": 10.0
},
"data": 259.3334655761719
}
3. API Sulfur Dioxide (SO2)
GET/
http://api.openweathermap.org/pollution/v1/so2/0.0,10.0/current.json?appid={api_key}
{
"time": "2016-03-03T12:00:00Z",
"location": {
"latitude": 0.0,
"longitude": 10.0
},
"data": [
{
"precision": -9.99999993922529e-9,
"pressure": 1000,
"value": 0
},
{
"precision": -9.99999993922529e-9,
"pressure": 681.2920532226562,
"value": 0
}
]
}

4. API Nitrogen Dioxide
GET/
http://api.openweathermap.org/pollution/v1/no2/0.0,10.0/current.json?appid={your-api-key}
{
"time": "2016-03-03T12:00:00Z",
"location": {
"latitude": 0.0,
"longitude": 10.0
},
"data": {
"no2":{
"precision":1.436401748934656e+15,
"value":2.550915831693312e+15
},
"no2_strat":{
"precision":2.00000000753664e+14,
"value":1.780239650783232e+15
},
"no2_trop":{
"precision":1.464945698930688e+15,
"value":7.7067618091008e+14
}
}
}
Якщо сервер поверне якусь помилку або дані будуть пусті, сповістити про це
користувача відповідним повідомленням.
