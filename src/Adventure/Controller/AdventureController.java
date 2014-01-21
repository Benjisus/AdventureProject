package Adventure.Controller;

import java.util.ArrayList;

import Adventure.Model.AdventureModel;
import Adventure.View.AdventureFrame;


public class AdventureController
{
		
		// private ChatBotView myView;
		private  AdventureModel myAdventure;
		private AdventureFrame appFrame;
		private RobEvent robbing;
		
		
		public AdventureController()
		{
			// myView = new ChatBotView();
			myAdventure = new AdventureModel();
			robbing = new RobEvent();
		}
		
		public AdventureModel getMyChatBot()
		{
			return myAdventure;
		}

		
		
		public void start()
		{
			// myView.showApp();
			appFrame = new AdventureFrame(this);
			robbing.startAdventure(userInput);
		}
		

		
	}
