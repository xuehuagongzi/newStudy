//package redis;
//
//import java.util.*;
//
///**
// * Created by zhangwenqiang on 2016/11/29.
// */
//public class RedisMain {
//    public static void main(String[] args) {
//        //new RedisClient().show();
//        RedisClient redisClient=new RedisClient();
//////        redisClient.KeyOperate();
////       redisClient.set("name","zhangsan");
////        redisClient.set("birth","1992");
////        System.out.println(redisClient.get("name"));
////       System.out.println(redisClient.get("birth"));
////        redisClient.KeyOperate();
//        //redisClient.getJedis().flushDB();
////        redisClient.getJedis().set("key001", "value001");
////        redisClient.getJedis().set("key002", "value002");
////        redisClient.getJedis().set("key003", "value003");
////        Set<String> stringSet= redisClient.getJedis().keys("*");
////        for(String str:stringSet){
////            System.out.println(str);
////    }
////        System.out.println(redisClient.get("name"));
//        //redisClient.set("a","b");
//
////        List list1 =new ArrayList();
////        list1.add("1111");
////        list1.add("2222");
////        list1.add("3333");
////
////        List list2 =new ArrayList();
////        list2.add("3333");
////        list2.add("4444");
////        list2.add("5555");
////        list1.removeAll(list2);
////        list1.addAll(list2);
////        list1.forEach(System.out::println);
////        intersect(list1, list2).forEach(System.out::println);
////        union(list1,list2).forEach(System.out::println);
//    }
//    /**
//     * 求ls对ls2的差集,即ls中有，但ls2中没有的
//     *
//     * @param ls
//     * @param ls2
//     * @return
//     */
//    public static List diff(List ls, List ls2) {
//        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
//        Collections.copy(list, ls);
//        list.removeAll(ls2);
//        return list;
//    }
//
//    /**
//     * 求2个集合的交集
//     *
//     * @param ls
//     * @param ls2
//     * @return
//     */
//    public static List intersect(List ls, List ls2) {
//        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
//        Collections.copy(list, ls);
//        list.retainAll(ls2);
//        return list;
//    }
//
//    /**
//     * 求2个集合的并集
//     *
//     * @param ls
//     * @param ls2
//     * @return
//     */
//    public static List union(List ls, List ls2) {
//        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
//        Collections.copy(list, ls);//将ls的值拷贝一份到list中
//        list.removeAll(ls2);
//        list.addAll(ls2);
//        return list;
//    }
//
//}
