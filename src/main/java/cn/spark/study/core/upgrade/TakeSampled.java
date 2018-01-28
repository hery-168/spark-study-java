package cn.spark.study.core.upgrade;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class TakeSampled {

	public static void main(String[] args) {
		SparkConf conf = new SparkConf()
				.setAppName("Sample")
				.setMaster("local");
		JavaSparkContext sc = new JavaSparkContext(conf);
	



		
		sc.close();
	}
	
}
