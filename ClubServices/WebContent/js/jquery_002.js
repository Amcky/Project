(function($){
	$.fn.extend({
		//插件名称
		bannerSwitch: function (options) {
			//基本参数
			var defaults = {
				time : 5000,
				animation : 800
			};

			var options = $.extend(defaults, options);

			return this.each(function(){
				//执行的函数
				var o = options , obj = $(this) , objLi = obj.find("li") , objDd = obj.find("dd") , objDdLen = objDd.length , 
					objIndex = 1 , objPrev = obj.find("span.prev") , objNext = obj.find("span.next");

				objLi.eq(0).show();
				objDd.eq(0).addClass("current");

				objDd.click(function(){
					if(objLi.eq($(this).index()).is(":hidden")){
						objLi.stop(true,true).fadeOut(o.animation).eq(objDd.removeClass("current").index($(this).addClass("current"))).fadeIn(o.animation);
						obj.find(".txt").text(objLi.eq($(this).index()).find("img").attr("alt"));
					}
				});

				objPrev.click(function(){
					objIndex = obj.find("dd.current").index();
					objDd.eq(objIndex-1).click();
				});

				objNext.click(function(){
					objIndex = obj.find("dd.current").index();
					if(objIndex==(objDdLen-1)){
						objIndex=0;
						objDd.eq(objIndex).click();
					}else{
						objDd.eq(objIndex+1).click();
					}
				});
				
				obj.hover(function(){
					clearInterval(switchTime);
				},function(){
					objIndex = obj.find("dd.current").index()+1;
					if(objIndex==objDdLen){
						objIndex=0;
					}
					switchTime = setInterval(function(){
						objDd.eq(objIndex).click();
						objIndex++;
						if(objIndex==objDdLen){
							objIndex=0;
						}
					},o.time);
				});
				
				var switchTime = setInterval(function(){
					objDd.eq(objIndex).click();
					objIndex++;
					if(objIndex==objDdLen){
						objIndex=0;
					}
				},o.time);
			});
		}
	});
})(jQuery);