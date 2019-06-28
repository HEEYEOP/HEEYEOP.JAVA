$(document).ready(function(){ 

	//자동완성기능 박스 내려오게 하는 기능----------------------------------------
	$('.auto-search').click(function(){ 
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up'); 
		//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드 
		$('.search-input-box').toggleClass('border-bottom-none'); 
		$('.auto-box').slideToggle(1000); 
	});


	//실시간순위 전체보기박스 나타내는 기능----------------------------------------
	$('.realtime-search').mouseenter(function(){
		$('.realtime-search-box').addClass('display-block');
	});

	$('.realtime-search-box').mouseout(function(){
		$(this).removeClass('display-block');
	});

	//실시간순위 자동으로 넘어가는 함수 및 기능----------------------------------------
	function ticker(selector, height){
		setTimeout(function(){
								$(selector +' li:first').animate(  {marginTop: '-'+height}, 
											   						400, 
											   						function(){ $(this).detach().appendTo(selector +' ul').removeAttr('style')}	);
		ticker(selector, height); //이걸 굳이 꼭 써야하는 건가????????????
		}, 1000);
	};
	 
	ticker('.realtime-search','20px');

	//뉴스헤드라인 자동으로 넘어가는 기능---------------------------------------- 
	ticker('.news-ticker','20px');

	//좌우버튼 클릭 시 페이지 넘어가는 기능---------------------------------------
	$('.r2-top-btn.next').click(function(){
		var num = $('#num').text();
		num++;
		if(num==7) num = 1;
		$('#num').text(num);
	});

	$('.r2-top-btn.prev').click(function(){
		var num = $('#num').text();
		num--;
		if(num==0) num = 6;
		$('#num').text(num);
	});

	//((내코드))좌우버튼 클릭 시 페이지 넘어가는 기능---------------------------------------
	// $('.r2-top-btn').click(function(){
		
	// 	if($(this).find('i').hasClass('r2-prev')){
	// 		var cnt = $('.r2-page b').text();
	// 		if(cnt > 1)
	// 			$('.r2-page b').text(--cnt); //cnt-1을 넣어주면 안된다 왜냐면 문자열 빼기 문자열이 되기 때문에 원하는 결과를 가져올 수 없음
	// 	}
	// 	else{
	// 		var cnt = $('.r2-page b').text();
	// 		if(cnt < 6)
	// 		$('.r2-page b').text(++cnt);
	// 	}
	// });

	// 구독|기사보기 기능
	$('.l3-item').hover(function(){
		$(this).find('img').toggleClass('img-none');
		$(this).find('div').toggleClass('reading-box');
	});

	//더보기 접기 기능
	$('.more').click(function(){
		
		if($(this).hasClass('fold')){
			$('.more-whitebox').removeClass('display-block');
			$('.more-clearbox').removeClass('display-block');
			$('.con4 li').find('input').addClass('display-none');
			$('.whitebox-buttons1').removeClass('display-none');
			$('.whitebox-buttons2').removeClass('display-block');

			
		}else{
			
			$('.more-whitebox').addClass('display-block');
			$('.more-clearbox').addClass('display-block');
		}
		$(this).toggleClass('fold');
	});

	//더보기에 '메뉴설정'클릭하면 체크박스로 만들어라
	$('#select-menu').click(function(){
		$('.con4 li').find('input').removeClass('display-none');
	});
	
	//x버튼 누르면 창닫으면서 되돌리는 기능
	$('#X').click(function(){
		$('#more-button').removeClass('fold');
		$('.more-whitebox').removeClass('display-block');
			$('.more-clearbox').removeClass('display-block');
			$('.con4 li').find('input').addClass('display-none');
	});

	//메뉴설정 누르면 whitebox-buttons2 띄우기
	$('#select-menu').click(function(){
		$('.whitebox-buttons1').addClass('display-none');
		$('.whitebox-buttons2').addClass('display-block');

	});





});





// //실시간검색어 넘어가는 기능1
// function ticker(){
// 	setTimeout(f1,1000);	//1초 후에 f1함수를 실행하라
// };

// function f1(){
// 	$('.realtime-search li:first').animate({marginTop: '-20px'}, 400,f2);	//첫번째 li태그를 0.4초동안 위로 20px올린 후 f2실행하라
// 	ticker();	//ticker()함수는 재귀함수처럼 보이지만 일반 재귀함수랑 형태가 다르다
// }
// function f2(){	//맨위에 있는 li태그를 잘라서 ul태그 끝에 붙이는 함수
// 	$(this) //li태그 첫번째 요소
// 		.detach() //떼와서
// 			.appendTo('.realtime-search ul') //ul태그 뒤에
// 				.removeAttr('style'); //위에서 animate로 적용시킨 margin-top:-20px을 제거
// };

// ticker();	//ticker()함수 실행






//실시간검색어 넘어가는 기능-------------(위의코드 하나로 합친 것)--------------------------------
// function ticker(){
// 	setTimeout(function(){
// 		$('.realtime-search li:first').animate( {marginTop: '-20px'}, 400, function(){
// 			$(this).detach().appendTo('ul#ticker').removeAttr('style');
// 		});
// 		ticker();
// 	}, 1000);
// };
// ticker();




//A.append(B) //A요소 자손들 끝에 B를 추가
//A.appendTo(B) //A요소를 B자손 끝에 추가