<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>hello world</title>	
	<%@include file="base/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="${ctx}/static/css/tictactoe.css" />
	<link rel='stylesheet prefetch' href='//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.1.0/css/font-awesome.min.css' />
</head>
<body>	
	<div class="container">
		<div class="header">
			<div class="module-index">
				<p><a href="${ctx}/blog">博客</a></p>
			</div>
		</div>
		<div class="content">
			<div class="tic-tac-toe">
			  <input id="block1-1-1" type="radio" class="player-1 left first-column top first-row first-diagonal turn-1"/>
			  <label for="block1-1-1" class="turn-1"></label>
			  <input id="block1-1-2" type="radio" class="player-1 middle second-column top first-row turn-1"/>
			  <label for="block1-1-2" class="turn-1"></label>
			  <input id="block1-1-3" type="radio" class="player-1 right third-column top first-row second-diagonal turn-1"/>
			  <label for="block1-1-3" class="turn-1"></label>
			  <input id="block1-2-1" type="radio" class="player-1 left first-column center second-row turn-1"/>
			  <label for="block1-2-1" class="turn-1"></label>
			  <input id="block1-2-2" type="radio" class="player-1 middle second-column center second-row first-diagonal second-diagonal turn-1"/>
			  <label for="block1-2-2" class="turn-1"></label>
			  <input id="block1-2-3" type="radio" class="player-1 right third-column center second-row turn-1"/>
			  <label for="block1-2-3" class="turn-1"></label>
			  <input id="block1-3-1" type="radio" class="player-1 left first-column bottom third-row second-diagonal turn-1"/>
			  <label for="block1-3-1" class="turn-1"></label>
			  <input id="block1-3-2" type="radio" class="player-1 middle second-column bottom third-row turn-1"/>
			  <label for="block1-3-2" class="turn-1"></label>
			  <input id="block1-3-3" type="radio" class="player-1 right third-column bottom third-row first-diagonal turn-1"/>
			  <label for="block1-3-3" class="turn-1"></label>
			  <input id="block2-1-1" type="radio" class="player-2 left first-column top first-row first-diagonal turn-2"/>
			  <label for="block2-1-1" class="turn-2"></label>
			  <input id="block2-1-2" type="radio" class="player-2 middle second-column top first-row turn-2"/>
			  <label for="block2-1-2" class="turn-2"></label>
			  <input id="block2-1-3" type="radio" class="player-2 right third-column top first-row second-diagonal turn-2"/>
			  <label for="block2-1-3" class="turn-2"></label>
			  <input id="block2-2-1" type="radio" class="player-2 left first-column center second-row turn-2"/>
			  <label for="block2-2-1" class="turn-2"></label>
			  <input id="block2-2-2" type="radio" class="player-2 middle second-column center second-row first-diagonal second-diagonal turn-2"/>
			  <label for="block2-2-2" class="turn-2"></label>
			  <input id="block2-2-3" type="radio" class="player-2 right third-column center second-row turn-2"/>
			  <label for="block2-2-3" class="turn-2"></label>
			  <input id="block2-3-1" type="radio" class="player-2 left first-column bottom third-row second-diagonal turn-2"/>
			  <label for="block2-3-1" class="turn-2"></label>
			  <input id="block2-3-2" type="radio" class="player-2 middle second-column bottom third-row turn-2"/>
			  <label for="block2-3-2" class="turn-2"></label>
			  <input id="block2-3-3" type="radio" class="player-2 right third-column bottom third-row first-diagonal turn-2"/>
			  <label for="block2-3-3" class="turn-2"></label>
			  <input id="block3-1-1" type="radio" class="player-1 left first-column top first-row first-diagonal turn-3"/>
			  <label for="block3-1-1" class="turn-3"></label>
			  <input id="block3-1-2" type="radio" class="player-1 middle second-column top first-row turn-3"/>
			  <label for="block3-1-2" class="turn-3"></label>
			  <input id="block3-1-3" type="radio" class="player-1 right third-column top first-row second-diagonal turn-3"/>
			  <label for="block3-1-3" class="turn-3"></label>
			  <input id="block3-2-1" type="radio" class="player-1 left first-column center second-row turn-3"/>
			  <label for="block3-2-1" class="turn-3"></label>
			  <input id="block3-2-2" type="radio" class="player-1 middle second-column center second-row first-diagonal second-diagonal turn-3"/>
			  <label for="block3-2-2" class="turn-3"></label>
			  <input id="block3-2-3" type="radio" class="player-1 right third-column center second-row turn-3"/>
			  <label for="block3-2-3" class="turn-3"></label>
			  <input id="block3-3-1" type="radio" class="player-1 left first-column bottom third-row second-diagonal turn-3"/>
			  <label for="block3-3-1" class="turn-3"></label>
			  <input id="block3-3-2" type="radio" class="player-1 middle second-column bottom third-row turn-3"/>
			  <label for="block3-3-2" class="turn-3"></label>
			  <input id="block3-3-3" type="radio" class="player-1 right third-column bottom third-row first-diagonal turn-3"/>
			  <label for="block3-3-3" class="turn-3"></label>
			  <input id="block4-1-1" type="radio" class="player-2 left first-column top first-row first-diagonal turn-4"/>
			  <label for="block4-1-1" class="turn-4"></label>
			  <input id="block4-1-2" type="radio" class="player-2 middle second-column top first-row turn-4"/>
			  <label for="block4-1-2" class="turn-4"></label>
			  <input id="block4-1-3" type="radio" class="player-2 right third-column top first-row second-diagonal turn-4"/>
			  <label for="block4-1-3" class="turn-4"></label>
			  <input id="block4-2-1" type="radio" class="player-2 left first-column center second-row turn-4"/>
			  <label for="block4-2-1" class="turn-4"></label>
			  <input id="block4-2-2" type="radio" class="player-2 middle second-column center second-row first-diagonal second-diagonal turn-4"/>
			  <label for="block4-2-2" class="turn-4"></label>
			  <input id="block4-2-3" type="radio" class="player-2 right third-column center second-row turn-4"/>
			  <label for="block4-2-3" class="turn-4"></label>
			  <input id="block4-3-1" type="radio" class="player-2 left first-column bottom third-row second-diagonal turn-4"/>
			  <label for="block4-3-1" class="turn-4"></label>
			  <input id="block4-3-2" type="radio" class="player-2 middle second-column bottom third-row turn-4"/>
			  <label for="block4-3-2" class="turn-4"></label>
			  <input id="block4-3-3" type="radio" class="player-2 right third-column bottom third-row first-diagonal turn-4"/>
			  <label for="block4-3-3" class="turn-4"></label>
			  <input id="block5-1-1" type="radio" class="player-1 left first-column top first-row first-diagonal turn-5"/>
			  <label for="block5-1-1" class="turn-5"></label>
			  <input id="block5-1-2" type="radio" class="player-1 middle second-column top first-row turn-5"/>
			  <label for="block5-1-2" class="turn-5"></label>
			  <input id="block5-1-3" type="radio" class="player-1 right third-column top first-row second-diagonal turn-5"/>
			  <label for="block5-1-3" class="turn-5"></label>
			  <input id="block5-2-1" type="radio" class="player-1 left first-column center second-row turn-5"/>
			  <label for="block5-2-1" class="turn-5"></label>
			  <input id="block5-2-2" type="radio" class="player-1 middle second-column center second-row first-diagonal second-diagonal turn-5"/>
			  <label for="block5-2-2" class="turn-5"></label>
			  <input id="block5-2-3" type="radio" class="player-1 right third-column center second-row turn-5"/>
			  <label for="block5-2-3" class="turn-5"></label>
			  <input id="block5-3-1" type="radio" class="player-1 left first-column bottom third-row second-diagonal turn-5"/>
			  <label for="block5-3-1" class="turn-5"></label>
			  <input id="block5-3-2" type="radio" class="player-1 middle second-column bottom third-row turn-5"/>
			  <label for="block5-3-2" class="turn-5"></label>
			  <input id="block5-3-3" type="radio" class="player-1 right third-column bottom third-row first-diagonal turn-5"/>
			  <label for="block5-3-3" class="turn-5"></label>
			  <input id="block6-1-1" type="radio" class="player-2 left first-column top first-row first-diagonal turn-6"/>
			  <label for="block6-1-1" class="turn-6"></label>
			  <input id="block6-1-2" type="radio" class="player-2 middle second-column top first-row turn-6"/>
			  <label for="block6-1-2" class="turn-6"></label>
			  <input id="block6-1-3" type="radio" class="player-2 right third-column top first-row second-diagonal turn-6"/>
			  <label for="block6-1-3" class="turn-6"></label>
			  <input id="block6-2-1" type="radio" class="player-2 left first-column center second-row turn-6"/>
			  <label for="block6-2-1" class="turn-6"></label>
			  <input id="block6-2-2" type="radio" class="player-2 middle second-column center second-row first-diagonal second-diagonal turn-6"/>
			  <label for="block6-2-2" class="turn-6"></label>
			  <input id="block6-2-3" type="radio" class="player-2 right third-column center second-row turn-6"/>
			  <label for="block6-2-3" class="turn-6"></label>
			  <input id="block6-3-1" type="radio" class="player-2 left first-column bottom third-row second-diagonal turn-6"/>
			  <label for="block6-3-1" class="turn-6"></label>
			  <input id="block6-3-2" type="radio" class="player-2 middle second-column bottom third-row turn-6"/>
			  <label for="block6-3-2" class="turn-6"></label>
			  <input id="block6-3-3" type="radio" class="player-2 right third-column bottom third-row first-diagonal turn-6"/>
			  <label for="block6-3-3" class="turn-6"></label>
			  <input id="block7-1-1" type="radio" class="player-1 left first-column top first-row first-diagonal turn-7"/>
			  <label for="block7-1-1" class="turn-7"></label>
			  <input id="block7-1-2" type="radio" class="player-1 middle second-column top first-row turn-7"/>
			  <label for="block7-1-2" class="turn-7"></label>
			  <input id="block7-1-3" type="radio" class="player-1 right third-column top first-row second-diagonal turn-7"/>
			  <label for="block7-1-3" class="turn-7"></label>
			  <input id="block7-2-1" type="radio" class="player-1 left first-column center second-row turn-7"/>
			  <label for="block7-2-1" class="turn-7"></label>
			  <input id="block7-2-2" type="radio" class="player-1 middle second-column center second-row first-diagonal second-diagonal turn-7"/>
			  <label for="block7-2-2" class="turn-7"></label>
			  <input id="block7-2-3" type="radio" class="player-1 right third-column center second-row turn-7"/>
			  <label for="block7-2-3" class="turn-7"></label>
			  <input id="block7-3-1" type="radio" class="player-1 left first-column bottom third-row second-diagonal turn-7"/>
			  <label for="block7-3-1" class="turn-7"></label>
			  <input id="block7-3-2" type="radio" class="player-1 middle second-column bottom third-row turn-7"/>
			  <label for="block7-3-2" class="turn-7"></label>
			  <input id="block7-3-3" type="radio" class="player-1 right third-column bottom third-row first-diagonal turn-7"/>
			  <label for="block7-3-3" class="turn-7"></label>
			  <input id="block8-1-1" type="radio" class="player-2 left first-column top first-row first-diagonal turn-8"/>
			  <label for="block8-1-1" class="turn-8"></label>
			  <input id="block8-1-2" type="radio" class="player-2 middle second-column top first-row turn-8"/>
			  <label for="block8-1-2" class="turn-8"></label>
			  <input id="block8-1-3" type="radio" class="player-2 right third-column top first-row second-diagonal turn-8"/>
			  <label for="block8-1-3" class="turn-8"></label>
			  <input id="block8-2-1" type="radio" class="player-2 left first-column center second-row turn-8"/>
			  <label for="block8-2-1" class="turn-8"></label>
			  <input id="block8-2-2" type="radio" class="player-2 middle second-column center second-row first-diagonal second-diagonal turn-8"/>
			  <label for="block8-2-2" class="turn-8"></label>
			  <input id="block8-2-3" type="radio" class="player-2 right third-column center second-row turn-8"/>
			  <label for="block8-2-3" class="turn-8"></label>
			  <input id="block8-3-1" type="radio" class="player-2 left first-column bottom third-row second-diagonal turn-8"/>
			  <label for="block8-3-1" class="turn-8"></label>
			  <input id="block8-3-2" type="radio" class="player-2 middle second-column bottom third-row turn-8"/>
			  <label for="block8-3-2" class="turn-8"></label>
			  <input id="block8-3-3" type="radio" class="player-2 right third-column bottom third-row first-diagonal turn-8"/>
			  <label for="block8-3-3" class="turn-8"></label>
			  <input id="block9-1-1" type="radio" class="player-1 left first-column top first-row first-diagonal turn-9"/>
			  <label for="block9-1-1" class="turn-9"></label>
			  <input id="block9-1-2" type="radio" class="player-1 middle second-column top first-row turn-9"/>
			  <label for="block9-1-2" class="turn-9"></label>
			  <input id="block9-1-3" type="radio" class="player-1 right third-column top first-row second-diagonal turn-9"/>
			  <label for="block9-1-3" class="turn-9"></label>
			  <input id="block9-2-1" type="radio" class="player-1 left first-column center second-row turn-9"/>
			  <label for="block9-2-1" class="turn-9"></label>
			  <input id="block9-2-2" type="radio" class="player-1 middle second-column center second-row first-diagonal second-diagonal turn-9"/>
			  <label for="block9-2-2" class="turn-9"></label>
			  <input id="block9-2-3" type="radio" class="player-1 right third-column center second-row turn-9"/>
			  <label for="block9-2-3" class="turn-9"></label>
			  <input id="block9-3-1" type="radio" class="player-1 left first-column bottom third-row second-diagonal turn-9"/>
			  <label for="block9-3-1" class="turn-9"></label>
			  <input id="block9-3-2" type="radio" class="player-1 middle second-column bottom third-row turn-9"/>
			  <label for="block9-3-2" class="turn-9"></label>
			  <input id="block9-3-3" type="radio" class="player-1 right third-column bottom third-row first-diagonal turn-9"/>
			  <label for="block9-3-3" class="turn-9"></label>
			  <div class="end">
				<h3></h3><a href="">Restart</a>
			  </div>
			</div>
			
		</div>
	</div>
	<div class="footer">
    	<p>Copyright &copy; belucky.me. All rights reserved. </p>         
	</div>
</body>
</html>