public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        setZ(z);
    }
    public float[] getXYZ(){
        float[] arr=new float[3];
        arr[0]=getX();
        arr[1]=getY();
        arr[2]=z;
        return arr;
    }
    @Override
    public String toString(){
        return "x,y,z="+getX()+","+getY()+","+getZ();
    }

}
