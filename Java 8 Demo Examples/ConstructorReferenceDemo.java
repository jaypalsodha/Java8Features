
class Sample
{
	Sample(String s){
		System.out.println("Sample class constructor implementation . . "+ s);
	}

	Sample(){
		System.out.println("No argument constructor implementation . . ");
	}
}
interface I{
	public Sample get(String s);
}
class ConstructorReferenceDemo
{
	public static void main(String[] args) {
		I i = Sample :: new;
		Sample s = i.get("1");
		Sample s1 = i.get("2");
		Sample s2 = i.get("3");
		Sample s3 = i.get("4");
	}
}