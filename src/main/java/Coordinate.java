import java.util.Objects;

public class Coordinate {

	
		private String Lattidute;
		private String Longitutide;
		public String getLattidute() {
			return Lattidute;
		}
		public void setLattidute(String lattidute) {
			Lattidute = lattidute;
		}
		public String getLongitutide() {
			return Longitutide;
		}
		public void setLongitutide(String longitutide) {
			Longitutide = longitutide;
		}
		@Override
		public int hashCode() {
			return Objects.hash(Lattidute, Longitutide);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Coordinate other = (Coordinate) obj;
			return Objects.equals(Lattidute, other.Lattidute) && Objects.equals(Longitutide, other.Longitutide);
		}
		@Override
		public String toString() {
			return "Coordinate [Lattidute=" + Lattidute + ", Longitutide=" + Longitutide + "]";
		}
		public Coordinate() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
