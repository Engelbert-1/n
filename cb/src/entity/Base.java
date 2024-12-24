package entity;
public enum Base{
    BIN(2),DEC(10),HEX(16);
    private int base;

    private Base(int base) {
        this.base = base;
    }

    public static Base getBase(int type){
        switch(type){
            case 2:
                return BIN;
            case 10:
                return DEC;
            case 16:
                return HEX;
            default:
                throw new AssertionError();
        }
    }

    public int value() {
        return base;
    }
    
    
    
}