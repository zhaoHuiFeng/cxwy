//package com.huifengzhao.common;
//
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
//
//public class Log {
//
//    static public void main(String[] args) {
//        BasicConfigurator.configure();
//    }
//
//    public Log() {
//
//    }
//
//    /**
//     * ��ӡDEBUG�������־.
//     * @param content ����ַ���
//     */
//    public static void debug(String content) {
//        Logger logger = Logger.getLogger("DEBUG");
//        logger.debug(content);
//    }
//
//    /**
//     * ��ӡDEBUG�������־.
//     * @param name ���ô˷�������
//     */
//    public static void debug(String name, String contentnew) {
//        Logger logger = Logger.getLogger("DEBUG");
//        String content=contentnew;
//        StringBuffer buffer = new StringBuffer(128);
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.debug(content);
//    }
//
//
//    public static void info(String name, String contentnew) {
//        Logger logger = Logger.getLogger("INFO");
//        String content=contentnew;
//        StringBuffer buffer = new StringBuffer(128);
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.info(content);
//    }
//
//    /**
//     * ��ӡWARN�������־.
//     * @param name ���ô˷�������
//     */
//    public static void warn(String name, String contentnew) {
//        Logger logger = Logger.getLogger("WARN");
//        String content=contentnew;
//        StringBuffer buffer = new StringBuffer(128);
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.warn(content);
//    }
//
//    /**
//     * ��ӡERROR�������־.
//     * @param name ���ô˷�������
//     */
//    public static void err(String name, String contentnew) {
//        Logger logger = Logger.getLogger("ERROR");
//        String content=contentnew;
//        StringBuffer buffer = new StringBuffer(128);
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.error(content);
//    }
//
//    /**
//     * ��ӡERROR�������־.
//     * @param type �������������
//     * @param name ���ô˷�������
//     * @param content ����ַ���
//     */
//    public static void debug(String type, String name, String content) {
//        Logger logger = Logger.getLogger(type);
//        logger.debug(content);
//    }
//
//    /**
//     * ��ӡINFO�������־.
//     * @param type �������������
//     * @param name ���ô˷�������
//     */
//    public static void info(String type, String name, String contentnew) {
//        Logger logger = Logger.getLogger(type);
//        String content=contentnew;
//        StringBuffer buffer = new StringBuffer(128);
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.info(content);
//    }
//
//    /**
//     * ��ӡWARN�������־.
//     * @param type �������������
//     * @param name ���ô˷�������
//     */
//    public static void warn(String type, String name, String contentnew) {
//        Logger logger = Logger.getLogger(type);
//        StringBuffer buffer = new StringBuffer(128);
//        String content = contentnew;
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.warn(content);
//    }
//
//    /**
//     * ��ӡERROR�������־.
//     * @param type �������������
//     * @param name ���ô˷�������
//     */
//    public static void err(String type, String name, String contentnew) {
//        Logger logger = Logger.getLogger(type);
//        StringBuffer buffer = new StringBuffer(128);
//        String content = contentnew;
//        if(!(name.trim().equals(""))) {
//        	buffer.append("[");
//        	buffer.append(name.trim());
//        	buffer.append("] ");
//        	buffer.append(content);
//        	content = buffer.toString();
//        }
//        logger.error(content);
//    }
//
//}
