import com.hazelcast.client.ClientConfig;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Map;

public class HazelcastDemoClient {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.addAddress("127.0.0.1:5701");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap map = client.getMap("customers");
        System.out.println("Map Size:" + map.size());
//
//        for(Object e : map.entrySet().iterator()) {
//            e.
//        }

        System.out.println(((Map.Entry) map.entrySet().iterator().next()).toString());

        System.out.println("entrys: " + map.entrySet().toString());
    }
}