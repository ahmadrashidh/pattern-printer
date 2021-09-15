package shapes;

public @interface ClassPreamble {
	
	String author();
	String date();
	int currentRevision() default 1;
	String[] reviewers();

}
