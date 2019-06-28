$(document).ready(function(){

	$('.auto-search').click(function(){
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');
		$('.search-input-box').toggleClass('border-bottom-none');   //검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.auto-box').slideToggle(10);
    });
    
	$('.realtime-search').mouseenter(function(){
		$('.realtime-search-box').addClass('display-block');
    });
    
	$('.realtime-search-box').mouseout(function(){
		$(this).removeClass('display-block');
    });
    
    

	function ticker(selector,height){
		setTimeout(function(){
			$(selector+' li:first')
				.animate( {marginTop: '-'+height}, 400, function(){
					$(this)
						.detach()
						.appendTo(selector+' ul')
						.removeAttr('style');
      });
			ticker(selector,height);
		}, 1000);
    };
    
	ticker('.realtime-search','20px');
    ticker('.news-ticker','20px');
    

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
    
    
	$('.l3-item-p').hover(function(){
		$(this).find('.l3-item-1').toggleClass('display-block');
		$(this).find('.l3-item').toggleClass('display-none');
	});

	//더보기 또는 접기 버튼 클릭하면 
	$('.more').click(function(){
		if($(this).hasClass('fold')){   //접기 버튼을 누르면 박스 접기
			moreBoxClose();	
		}
		else                            //아니면 박스 열기
			moreBoxOpen();
    });
    
	//메뉴 설정 클릭
	$('.sub1>a:nth-child(2)').click(function(){
		$('.sub1').addClass('display-none');
		$('.sub2').removeClass('display-none');
		$('.setting-list input[type=checkbox]').removeClass('display-none');
    });
    
	//각 서브메뉴 닫기 버튼 클릭
	$('.more-sub-menu .more-close').click(function(){
		moreBoxClose();
    });
    
	//취소버튼
	$('.sub2 a:nth-child(3)').click(function(){
		moreBoxClose();
		moreBoxOpen();
    });
    

	function moreBoxOpen(){
		moreBox();
		$('.sub1').removeClass('display-none');
	};
	function moreBoxClose(){
		moreBox();
		$('.sub2').addClass('display-none');
		$('.setting-list input[type=checkbox]').addClass('display-none');	
	};
	function moreBox(){
		$('.more-bg-box').toggleClass('display-none');
		$('.more-box').toggleClass('display-none');
		$('.more').toggleClass('fold');
	};
});

