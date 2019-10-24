package ru.itvitality.sbrf.cu.l04.io.dto;

public class User {
    private int id;
    private String login;
    private String name;

    public int getId() {
        return id;
    }

    public User setId( int id ) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin( String login ) {
        this.login = login;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName( String name ) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( "User{" );
        sb.append( "id=" ).append( id );
        sb.append( ", login='" ).append( login ).append( '\'' );
        sb.append( ", name='" ).append( name ).append( '\'' );
        sb.append( '}' );
        return sb.toString();
    }
}
