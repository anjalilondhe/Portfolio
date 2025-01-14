<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/brands.min.css">
    <style>
        .main{
            display: flex;
            position: relative;
        }
        .main .first{
            position: fixed;
            width: 250px;
            height: 100%;
            padding: 30px 0;
            margin-bottom: 70px;
        }
        .main .first ul li{
            padding: 2px;
        }
        li:hover{
            background-color: rgba(233, 227, 227, 0.7);
        }
        #abc{
            background-color: rgba(233, 227, 227, 0.7);
        }
        .second{
            width: 100%;
            height: 150px;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-left: 250px;
        }
        form{
            width: 600px;
            height: 40px;
            display: flex;
            text-align: left;
            border: 1px solid;
            border-top-left-radius: 25px;
            border-bottom-left-radius: 25px;
            border-top-right-radius: 25px;
            border-bottom-right-radius: 25px;
        }
        form input{
            text-align: left;
            flex: 1;
            border-top-left-radius: 25px;
            border-bottom-left-radius: 25px;
        }
        form button{
            padding: 5px 10px;
            border-top-right-radius: 25px;
            border-bottom-right-radius: 25px;
        }
        form .fa-magnifying-glass{
            font-size: 15px;
        }
        .second span{
            box-sizing: border-box;
            height: 40px;
            width: 42px;
            border-radius: 70px;
            margin-left: 10px;
            background-color: rgba(233, 227, 227, 0.7);
            /*position: -webkit-sticky;
            position: sticky;*/
        }
        .nav{
            margin-left: 250px;
        }
        .nav ul{
            height: 40px;
        }
        .nav ul li{
            display: inline;
            /*margin-right: 2px;*/
            background-color: rgba(233, 227, 227, 0.7);
            padding: 6px 10px;
            border-radius: 4px;
        }
        #single{
            background-color: black;
            color: white;
        }
        i{
            padding: 10px;
        }
        .block1{
            margin-left: 250px;
        }
        .block2{
            margin-left: 250px;
            margin-top: 30px;
        }
        img{
            width: 250px;
            height: 150px;
            border-top-right-radius: 20px;
            border-top-left-radius: 20px;
        }
        .card1{
            width: 250px; 
            display: inline-block;
            margin-left: 20px;
            margin-right: 20px;
            border: solid white;
            border-radius: 20px;
        }
        .box{
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="main">
        <div class="first">
            <ul type="none">
                <li><i class="fa-solid fa-bars" style="color: #010a18;"></i>
                    <i class="fa-brands fa-youtube" style="color: #f11404; font-size:x-large">
                    </i><strong style="font-size: x-large;">YouTube</strong></li>
                <li id="abc"><i class="fa fa-home" aria-hidden="true"></i>Home</li>
                <li><i class="fa-solid fa-arrow-up-short-wide" style="color: #010d23;"></i>Shorts</li>
                <li><i class="fa-solid fa-bell" style="color: #010d23;"></i>Subcriptions</li>
            </ul>
            <hr>

            <ul type="none">
                <li><i class="fa-solid fa-book" style="color: #00060f;"></i>Library</li>
                <li><i class="fa-sharp fa-solid fa-clock-rotate-left" style="color: #010a19;"></i>History</li>
                <li><i class="fa-sharp fa-regular fa-clock" style="color: #051024;"></i>Watch Later</li>
                <li><i class="fa-solid fa-thumbs-up" style="color: #010813;"></i>Liked Videos</li>
            </ul>
            <hr>

            <ul type="none">
                <small>Explore</small>
                <li><i class="fa-solid fa-money-bill" style="color: #01060e;"></i>Trending</li>
                <li><i class="fa-solid fa-bag-shopping" style="color: #020a17;"></i>Shopping</li>
                <li><i class="fa-solid fa-music" style="color: #020812;"></i>Music</li>
                <li><i class="fa-solid fa-film" style="color: #031026;"></i>Films</li>
                <li><i class="fa-solid fa-thumbs-up"></i>Liked Videos</li>
            </ul>
            </div>

            <div class="second">
                <div class="search">
                    <form>
                        <input type="text" placeholder="Search">
                        <button type="submit"><i class="fa-solid fa-magnifying-glass" style="font-size: 15px;"></i></button>
                    </form>
                </div>
                <span><i class="fa-solid fa-microphone" style="font-size: 25px; align-self:center;"></i></span>
            </div>
        </div>
    </div>
    <div class="nav">
        <ul type="none">
            <li id="single">All</li>
            <li>HTML</li>
            <li>Java</li>
            <li>Films</li>
            <li>Music</li>
            <li>Bollywood Actress</li>
            <li>Tarak Meheta ka Ulta Chasma</li>
            <li>Java Script</li>
            <li>TV Shows</li>
            <!-- <li>Indian Series</li> -->
        </ul>
    </div>
    <div class="block1">
        <div class="card1">
            <img src="./Images/music1.jpg" alt="Image">
            <div class="box">
                <p>Add Some description here</p>
            </div>
        </div>

        <div class="card1">
            <img src="./Images/music2.jpg" alt="Image">
            <div class="box">
                <p>Add some description here</p>
            </div>
        </div>

        <div class="card1">
            <img src="./Images/music3.webp" alt="Image">
            <div class="box">
                <p>Add some description here</p>
            </div>
        </div>
    </div>

    <div class="block2">
        <div class="card1">
            <img src="./Images/music5.jpg" alt="Image">
            <div class="box">
                <p>Add some description here</p>
            </div>
        </div>

        <div class="card1">
            <img src="./Images/music5.jpg" alt="Image">
            <div class="box">
                <p>Add some description here</p>
            </div>
        </div>
        
        <div class="card1">
            <img src="./Images/music7.jpg" alt="Image">
            <div class="box">
                <p>Add some description here</p>
            </div>
        </div>
    </div>
    
</body>
</html>