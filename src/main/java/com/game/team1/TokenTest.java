package com.game.team1;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

//토큰 만들기
@Slf4j
public class TokenTest {
	public static final Long EXPIRE_TIME = 3600000L;

	public static void main(String[] args) {
		
		JwtBuilder jb = Jwts.builder();
		Date date = new Date();
		Date expireDate = new Date(date.getTime() + EXPIRE_TIME); // 만료일
		
		jb.setHeaderParam("typ", "JWT");
		jb.setSubject("id");
		jb.setIssuedAt(date);// 발급일을 현재 시간으로
		jb.setExpiration(expireDate);// 만료일을 한시간 뒤로
		
		
		String keyStr="1234567890123456789012";
		Key key=Keys.hmacShaKeyFor(keyStr.getBytes());//키를 만들어
		jb.signWith(key,SignatureAlgorithm.HS256); //jb에 시그니처를 만들기 위해 싸인(예를 들어 토큰인건 알지만 내 싸인이 들어가 있어야 위조 토큰이 아니자나!)
		
		String token = jb.compact();// 토큰 만들어

		
		JwtParserBuilder jpb=Jwts.parserBuilder().setSigningKey(key);//시그니처로 만들기
		JwtParser jp=jpb.build();
		Jws<Claims> claims=jp.parseClaimsJws(token); //토큰 이름을 알기 위해 토큰을 파싱한 후
		String subject=claims.getBody().getSubject();//subject를 가져옴 
		System.out.println(subject);
		
		
		
		//발급된 토큰으로 나에게, 제대로 된 토큰인지 확인

	}
}
