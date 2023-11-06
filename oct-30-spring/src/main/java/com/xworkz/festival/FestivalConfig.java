package com.xworkz.festival;

	import org.springframework.context.annotation.Bean;

	public class FestivalConfig {
		@Bean
		public Dussehra getDussehra() {
			return new Dussehra();
		}
		@Bean
		public GaneshaFestival getGaneshaFestival() {
			return new GaneshaFestival();
		}

		@Bean
		public Diwali getDiwali() {
			Diwali diwali = new Diwali();
			return diwali;
		}

		@Bean
		public Christmas getChristmas() {
			return new Christmas();
		}

		@Bean
		public Holi getHoli() {
			return new Holi();
		}

		@Bean
		public Krishnashtami getKrishnashtami() {

			return new Krishnashtami();
		}

		@Bean
		public Moharam getMoharam() {
			return new Moharam();
		}

		@Bean
		public Navaratri getNavaratri() {

			return new Navaratri();
		}

		@Bean
		public Onam getOnam() {
			return new Onam();
		}

		@Bean
		public Sankranti getSankranti() {

			return new Sankranti();
		}

	}

