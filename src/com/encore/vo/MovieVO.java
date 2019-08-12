package com.encore.vo;

public class MovieVO {
		private String mov_name;
		private String genre;
		private String director;
		private String actor;
		private double star;
		private int time;
		
		public MovieVO() {
		}

		public String getMov_name() {
			return mov_name;
		}

		public void setMov_name(String mov_name) {
			this.mov_name = mov_name;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public String getActor() {
			return actor;
		}

		public void setActor(String actor) {
			this.actor = actor;
		}

		public double getStar() {
			return star;
		}

		public void setStar(double star) {
			this.star = star;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "MovieVO [mov_name=" + mov_name + ", genre=" + genre + ", director=" + director + ", actor=" + actor
					+ ", star=" + star + ", time=" + time + "]";
		}
		
		
}
