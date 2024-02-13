public enum FileType {
    GIF(".gif", new byte[]{(byte)0x47, (byte)0x49, (byte)0x46, (byte)0x38, (byte)0x39, (byte)0x61}),
    JPG(".jpg", new byte[]{(byte)0xff, (byte)0xd8}),
    CLASS(".class",new byte[]{(byte)0xca, (byte)0xfe, (byte)0xba, (byte)0xbe});

    public String getExt() {
        return ext;
    }

    public byte[] getSign() {
        return sign;
    }

    FileType(String ext, byte[] sign) {
        this.ext = ext;
        this.sign = sign;
    }

    private String ext;
    private byte[] sign;

    public boolean checkType(byte[] array){
        for (int i = 0; i <sign.length ; i++) {
            if (array[i]!=sign[i]){
                return  false;
            }
        }
       return true;
    }

}
