class Point {
	String id;
	double x,y;

	//TODO add new variable
String color="blue";
	//TODO constructor
public Point (String i,double a,double b)
{
	id=i;
	x=a;
	y=b;
}
	//TODO setters and getters
public void setID (String i)
{
	this.id=i;
}
public String getID()
{
	return id;
}
public void setX (double a)
{
	this.x=a;
}
public double getX()
{
	return x;
}
public void setY(double b)
{
	this.y=b;
}
public double getY()
{
	return y;
}
	public void move (char xDirection, char yDirection) {
		//TODO
		if (xDirection == 'L')
		x-=1;
		else x+=1;
		if (yDirection == 'U')
		y+=1;
		else y-=1;
	}

	public void draw () {
		//TODO
		System.out.println(id + ": "+ x + " " + y);
	}



}