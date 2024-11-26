package developer;

public class Youtube {
    public static void main(String[] args) {
        Channel ChannelOne = new Channel();

        Subscriber s1 = new Subscriber("Ruwanthi");
        Subscriber s2 = new Subscriber("Lakshika");
        Subscriber s3 = new Subscriber("Snaduni");
        Subscriber s4 = new Subscriber("Kasun");
        Subscriber s5 = new Subscriber("Tharaka");

        ChannelOne.subscriber(s1);
        ChannelOne.subscriber(s2);
        ChannelOne.subscriber(s3);
        ChannelOne.subscriber(s4);
        ChannelOne.subscriber(s5);

        ChannelOne.unSubscribe(s2);

        s1.subscribeChannel(ChannelOne);
        s2.subscribeChannel(ChannelOne);
        s3.subscribeChannel(ChannelOne);
        s4.subscribeChannel(ChannelOne);
        s5.subscribeChannel(ChannelOne);

        ChannelOne.upload("How to Learn Programming??");

    }
}
