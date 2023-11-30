package FactoryDesignPattern;

public class GetPlaneFactory {
	public Plane getPlane(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLANE")) {
			return new DomesticPlane();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLANE")) {
			return new CommercialPlane();
		}

		return null;
	}
}
