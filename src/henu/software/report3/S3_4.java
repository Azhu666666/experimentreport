package henu.software.report3;

public class S3_4 {
    static class TV{
        static int number=0;
        int id;
        boolean status;
        int volume;
        int channel;
        TV(){
            id=++number;
            status=false;
            volume=50;
            channel=1;
        }
        void open(){
            status=true;
        }
        void close(){
            status=false;
        }
        void changeChannel(int channel){
            this.channel=channel;
        }
        void changeVolume(int volume){
            this.volume=volume;
        }
        void show(){
            System.out.println("商品编号："+id+"开关状态："+status+"音量："+volume+"频道："+channel);
        }

    }
    public static void main(String[] args) {
        TV tv=new TV();
        tv.id=++TV.number;
        tv.status=true;
        tv.volume=50;
        tv.channel=1;
        tv.show();
        tv.changeChannel(2);
        tv.changeVolume(60);
        tv.show();
        tv.close();
        tv.show();
    }
}
