PrimeFaces.widget.DigitalClock = PrimeFaces.widget.BaseWidget.extend({
	
	init: function(cfg){
		
		this._super(cfg);
		
		var self = this;
		
		self.color =  cfg.color;
		self.fontSize = cfg.fontSize || 20;
		
		var time = moment().format("HH:mm:ss");
		
		$(PrimeFaces.escapeClientId(self.id)).text(time);
		$(PrimeFaces.escapeClientId(self.id)).css("color", self.color);
		$(PrimeFaces.escapeClientId(self.id)).css("fontSize", self.fontSize);
		
		
		setInterval(function(){
			
			var time = moment().format("HH:mm:ss");
			$(PrimeFaces.escapeClientId(self.id)).text(time);
			
		}, 1000);
	}
	
});