(function($){
	var bigAutocomplete = new function(){
		this.currentInputText = null;//目前锟斤拷霉锟斤拷锟斤拷锟斤拷锟津（斤拷锟揭伙拷锟揭筹拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷远锟斤拷锟饺拷锟斤拷埽锟�
		this.functionalKeyArray = [9,20,13,16,17,18,91,92,93,45,36,33,34,35,37,39,112,113,114,115,116,117,118,119,120,121,122,123,144,19,145,40,38,27];//锟斤拷锟斤拷锟较癸拷锟杰硷拷锟街碉拷锟斤拷锟�
		this.holdText = null;//锟斤拷锟斤拷锟斤拷锟皆硷拷锟斤拷锟斤拷锟斤拷锟斤拷
		
		//锟斤拷始锟斤拷锟斤拷锟斤拷锟皆讹拷锟斤拷全div锟斤拷锟斤拷锟斤拷document注锟斤拷mousedown锟斤拷锟斤拷锟斤拷锟絛iv锟斤拷锟斤拷锟斤拷锟斤拷div
		this.init = function(){
			$("body").append("<div id='bigAutocompleteContent' class='bigautocomplete-layout'></div>");
			$(document).bind('mousedown',function(event){
				var $target = $(event.target);
				if((!($target.parents().andSelf().is('#bigAutocompleteContent'))) && (!$target.is(bigAutocomplete.currentInputText))){
					bigAutocomplete.hideAutocomplete();
				}
			})
			
			//锟斤拷锟斤拷锟酵Ｊ毖★拷械锟角帮拷锟�
			$("#bigAutocompleteContent").delegate("tr", "mouseover", function() {
				$("#bigAutocompleteContent tr").removeClass("ct");
				$(this).addClass("ct");
			}).delegate("tr", "mouseout", function() {
				$("#bigAutocompleteContent tr").removeClass("ct");
			});		
			
			
			//锟斤拷锟斤拷选锟斤拷锟叫猴拷选锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟矫碉拷锟斤拷锟斤拷锟斤拷校锟斤拷锟街达拷锟絚allback锟斤拷锟斤拷
			$("#bigAutocompleteContent").delegate("tr", "click", function() {
				bigAutocomplete.currentInputText.val( $(this).find("div:last").html());
				var callback_ = bigAutocomplete.currentInputText.data("config").callback;
				if($("#bigAutocompleteContent").css("display") != "none" && callback_ && $.isFunction(callback_)){
					callback_($(this).data("jsonData"));
					
				}				
				bigAutocomplete.hideAutocomplete();
			})			
			
		}
		
		this.autocomplete = function(param){
			
			if($("body").length > 0 && $("#bigAutocompleteContent").length <= 0){
				bigAutocomplete.init();//锟斤拷始锟斤拷锟斤拷息
			}			
			
			var $this = $(this);//为锟斤拷锟皆讹拷锟斤拷全锟斤拷锟杰碉拷锟斤拷锟斤拷锟絡query锟斤拷锟斤拷
			
			var $bigAutocompleteContent = $("#bigAutocompleteContent");
			
			this.config = {
			               //width:锟斤拷锟斤拷锟斤拷目锟饺ｏ拷默锟斤拷使锟斤拷锟斤拷锟斤拷锟斤拷锟�
			               width:$this.outerWidth() - 2,
			               //url锟斤拷锟斤拷式url:""锟斤拷锟斤拷ajax锟斤拷台锟斤拷取锟斤拷荩锟斤拷锟斤拷氐锟斤拷锟捷革拷式为data锟斤拷锟斤拷一锟斤拷
			               url:null,
			               /*data锟斤拷锟斤拷式{data:[{title:null,result:{}},{title:null,result:{}}]}
			               url锟斤拷data锟斤拷锟斤拷只锟斤拷一锟斤拷锟斤拷效锟斤拷data锟斤拷锟斤拷*/
			               data:null,
			               //callback锟斤拷选锟斤拷锟叫后按回筹拷锟津单伙拷时锟截碉拷锟侥猴拷锟斤拷
			               callback:null};
			$.extend(this.config,param);
			
			$this.data("config",this.config);
			
			//锟斤拷锟斤拷锟絢eydown锟铰硷拷
			$this.keydown(function(event) {
				switch (event.keyCode) {
				case 40://锟斤拷锟铰硷拷
					
					if($bigAutocompleteContent.css("display") == "none")return;
					
					var $nextSiblingTr = $bigAutocompleteContent.find(".ct");
					if($nextSiblingTr.length <= 0){//没锟斤拷选锟斤拷锟斤拷时锟斤拷选锟叫碉拷一锟斤拷
						$nextSiblingTr = $bigAutocompleteContent.find("tr:first");
					}else{
						$nextSiblingTr = $nextSiblingTr.next();
					}
					$bigAutocompleteContent.find("tr").removeClass("ct");
					
					if($nextSiblingTr.length > 0){//锟斤拷锟斤拷一锟斤拷时锟斤拷锟斤拷锟斤拷锟斤拷锟揭伙拷校锟�
						$nextSiblingTr.addClass("ct");//选锟叫碉拷锟叫加憋拷锟斤拷
						$this.val($nextSiblingTr.find("div:last").html());//选锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟矫碉拷锟斤拷锟斤拷锟斤拷锟�
						
						//div锟斤拷锟斤拷锟斤拷选锟叫碉拷锟斤拷,jquery-1.6.1 $nextSiblingTr.offset().top 锟斤拷bug锟斤拷锟斤拷值锟斤拷锟斤拷锟斤拷
						$bigAutocompleteContent.scrollTop($nextSiblingTr[0].offsetTop - $bigAutocompleteContent.height() + $nextSiblingTr.height() );
						
					}else{
						$this.val(bigAutocomplete.holdText);//锟斤拷锟斤拷锟斤拷锟绞撅拷没锟皆硷拷锟斤拷锟斤拷值
					}
					
					
					break;
				case 38://锟斤拷锟较硷拷
					if($bigAutocompleteContent.css("display") == "none")return;
					
					var $previousSiblingTr = $bigAutocompleteContent.find(".ct");
					if($previousSiblingTr.length <= 0){//没锟斤拷选锟斤拷锟斤拷时锟斤拷选锟斤拷锟斤拷锟揭伙拷锟斤拷锟�
						$previousSiblingTr = $bigAutocompleteContent.find("tr:last");
					}else{
						$previousSiblingTr = $previousSiblingTr.prev();
					}
					$bigAutocompleteContent.find("tr").removeClass("ct");
					
					if($previousSiblingTr.length > 0){//锟斤拷锟斤拷一锟斤拷时锟斤拷锟斤拷锟角碉拷一锟叫ｏ拷
						$previousSiblingTr.addClass("ct");//选锟叫碉拷锟叫加憋拷锟斤拷
						$this.val($previousSiblingTr.find("div:last").html());//选锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟矫碉拷锟斤拷锟斤拷锟斤拷锟�
						
						//div锟斤拷锟斤拷锟斤拷选锟叫碉拷锟斤拷,jquery-1.6.1 $$previousSiblingTr.offset().top 锟斤拷bug锟斤拷锟斤拷值锟斤拷锟斤拷锟斤拷
						$bigAutocompleteContent.scrollTop($previousSiblingTr[0].offsetTop - $bigAutocompleteContent.height() + $previousSiblingTr.height());
					}else{
						$this.val(bigAutocomplete.holdText);//锟斤拷锟斤拷锟斤拷锟绞撅拷没锟皆硷拷锟斤拷锟斤拷值
					}
					
					break;
				case 27://ESC锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
					
					bigAutocomplete.hideAutocomplete();
					break;
				}
			});		
			
			//锟斤拷锟斤拷锟絢eyup锟铰硷拷
			$this.keyup(function(event) {
				var k = event.keyCode;
				var ctrl = event.ctrlKey;
				var isFunctionalKey = false;//锟斤拷锟铰的硷拷锟角凤拷锟角癸拷锟杰硷拷
				for(var i=0;i<bigAutocomplete.functionalKeyArray.length;i++){
					if(k == bigAutocomplete.functionalKeyArray[i]){
						isFunctionalKey = true;
						break;
					}
				}
				//k锟斤拷值锟斤拷锟角癸拷锟杰硷拷锟斤拷锟絚trl+c锟斤拷ctrl+x时锟脚达拷锟斤拷锟皆讹拷锟斤拷全锟斤拷锟斤拷
				if(!isFunctionalKey && (!ctrl || (ctrl && k == 67) || (ctrl && k == 88)) ){
					var config = $this.data("config");
					
					var offset = $this.offset();
					$bigAutocompleteContent.width(config.width);
					var h = $this.outerHeight() - 1;
					$bigAutocompleteContent.css({"top":offset.top + h,"left":offset.left});
					
					var data = config.data;
					var url = config.url;
					var keyword_ = $.trim($this.val());
					if(keyword_ == null || keyword_ == ""){
						bigAutocomplete.hideAutocomplete();
						return;
					}					
					if(data != null && $.isArray(data) ){

						var data_ = new Array();
						for(var i=0;i<data.length;i++){
							if(data[i].title.indexOf(keyword_) > -1){
								data_.push(data[i]);
							}
						}
						
						makeContAndShow(data_);
					}else if(url != null && url != ""){//ajax锟斤拷锟斤拷锟斤拷锟�

					var aa=	keyword_.length;
					
					
						if(aa<5)
							{
							$.post(url,{keyword:keyword_},function(result){
								
								
								makeContAndShow(result.data)
							},"json");
							
							}
						
					
					}

					
					bigAutocomplete.holdText = $this.val();
				}
				//锟截筹拷锟斤拷
				if(k == 13){
					var callback_ = $this.data("config").callback;
					if($bigAutocompleteContent.css("display") != "none"){
						if(callback_ && $.isFunction(callback_)){
							callback_($bigAutocompleteContent.find(".ct").data("jsonData"));
						}
						$bigAutocompleteContent.hide();						
					}
				}
				
			});	
			
					
			//锟斤拷装锟斤拷锟斤拷锟斤拷html锟斤拷锟捷诧拷锟斤拷示
			function makeContAndShow(data_){
				if(data_ == null || data_.length <=0 ){
					return;
				}
				
				var cont = "<table><tbody>";
				for(var i=0;i<data_.length;i++){
					cont += "<tr><td><div>" + data_[i].title + "</div></td></tr>"
				}
				cont += "</tbody></table>";
				$bigAutocompleteContent.html(cont);
				$bigAutocompleteContent.show();
				
				//每锟斤拷tr锟斤拷锟斤拷荩锟斤拷锟斤拷馗锟截碉拷锟斤拷锟斤拷
				$bigAutocompleteContent.find("tr").each(function(index){
					$(this).data("jsonData",data_[index]);
				})
			}			
					
			
			//锟斤拷锟斤拷锟絝ocus锟铰硷拷
			$this.focus(function(){
				bigAutocomplete.currentInputText = $this;
			});
			
		}
		//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
		this.hideAutocomplete = function(){
			var $bigAutocompleteContent = $("#bigAutocompleteContent");
			if($bigAutocompleteContent.css("display") != "none"){
				$bigAutocompleteContent.find("tr").removeClass("ct");
				$bigAutocompleteContent.hide();
			}			
		}
		
	};
	
	
	$.fn.bigAutocomplete = bigAutocomplete.autocomplete;
	
})(jQuery)