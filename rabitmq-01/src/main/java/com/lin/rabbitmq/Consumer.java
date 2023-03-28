//package com.lin.rabbitmq;
//
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//
//public class Consumer {
//
//    public static void main(String[] args) {
//        // 1: 创建连接工厂
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        // 2: 设置连接属性
//        connectionFactory.setHost("47.102.156.227");
//        connectionFactory.setPort(5672);
//        connectionFactory.setVirtualHost("/");
//        connectionFactory.setUsername("admin");
//        connectionFactory.setPassword("admin");
//        Connection connection = null;
//        Channel channel = null;
//        try {
//            // 3: 从连接工厂中获取连接
//            connection = connectionFactory.newConnection("生产者");
//            // 4: 从连接中获取通道channel
//            channel = connection.createChannel();
//            // 5: 申明队列queue存储消息
//            channel.basicConsume("queue1",true)
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println("发送消息出现异常...");
//        } finally {
//            // 7: 释放连接关闭通道
//            if (channel != null && channel.isOpen()) {
//                try {
//                    channel.close();
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//    }
//}
