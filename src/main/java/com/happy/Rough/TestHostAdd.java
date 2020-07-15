package com.happy.Rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.happy.utilities.MonitoringMail;
import com.happy.utilities.TestConfig;

public class TestHostAdd {
	public static void main(String[] args) throws UnknownHostException, AddressException, MessagingException {
		//System.out.println(InetAddress.getLocalHost().getHostAddress());
		MonitoringMail mail=new MonitoringMail();
		String messageBody="http://"+InetAddress.getLocalHost()+":9090/job/Project1/Extent_20Report/";
		System.out.println(messageBody);
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
	}

}
