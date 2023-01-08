package recode_classes.older_versions;

abstract class info_class
{
    protected static String cname,starttime;
    abstract public void setClassname(String t);

    abstract public void setStartTime(String t);
    
    public static String getClassname()
    {
        return cname==null ? "Computer" : cname;
    }
    
    public static String getStartTime()
    {
        return starttime;
    }
}