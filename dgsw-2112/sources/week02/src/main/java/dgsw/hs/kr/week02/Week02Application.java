package dgsw.hs.kr.week02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 서버 : 정보를 받는 놈
 * 클라이언트 : 고객
 * RDB : 관계형 데이터베이스
 * NoSQL : 구조포기, 디비 서버 여러개로 빅데이터 구축
 * NewSQL : RDB + NoSQL
 *
 * SQL - 명령어.
 * Mysql vs MariaDB
 * -회사 다름, 이름 다름
 * 도메인(IP를 글자로),
 * 아이피(인터넷 고정 주소),
 * 포트(아이피 안에 여러개)
 * 라이브러리 - 코드 모듈화, 코드 모은거.
 * 프레임워크 -
 */

@SpringBootApplication
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}

}
