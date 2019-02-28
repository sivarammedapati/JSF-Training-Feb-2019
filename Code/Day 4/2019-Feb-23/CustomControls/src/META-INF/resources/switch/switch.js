PrimeFaces.widget.SwitchButton = PrimeFaces.widget.BaseWidget.extend({
	
	
	init: function(cfg){
		
		this._super(cfg);
		var self = this;
		
		self.value = cfg.value == "true"? true : false;
		console.log("In SwitchButton init");
		
		$(PrimeFaces.escapeClientId(self.id)).click(function(){
			
			self.value = !self.value;
			
			if(self.value){
				$(PrimeFaces.escapeClientId(self.id + "_span")).text("On");
				$(PrimeFaces.escapeClientId(self.id + "_hidden")).val("true");
			}
			else{
				$(PrimeFaces.escapeClientId(self.id + "_span")).text("Off");
				$(PrimeFaces.escapeClientId(self.id + "_hidden")).val("false");
			}
			
			if(cfg.behaviors && cfg.behaviors.click){
			
				var input = $(PrimeFaces.escapeClientId(self.id + "_hidden"))
				cfg.behaviors.click.call(input);
			}
			
		});
		
	}
	
	
});