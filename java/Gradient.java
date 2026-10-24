class Gradient
{
    double mComp;
    double bComp;

    public Gradient(double mComp, double bComp) 
  {
        this.mComp = mComp;
        this.bComp = bComp;
    }

    public double getMagnitude() 
    {
        return Math.sqrt((mComp * mComp) + (bComp * bComp));
    }
}
