package Ch35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Retention(RetentionPolicy.RUNTIME)
 * 런타임시 동작하는 어노테이션
 * 어노테이션의 유지시간
 * 
 * @Retention(RetentionPolicy.SOURCE)
 * 컴파일 시에만 동작
 * 
 * @Target({ElementType.TYPE, ElementType.METHOD} )
 * 어노테이션 적용대상을 메서드로 지정
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD} )
public @interface C01Interface {  // 어노테이션용 인터페이스
	String value() default "";
	int number() default 0;
}
