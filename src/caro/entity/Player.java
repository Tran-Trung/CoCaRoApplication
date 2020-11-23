package caro.entity;

import javax.persistence.*;


@Entity
@Table()

public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int id;

    @Column(name = "account", length = 64, nullable = false, unique = true)
    private String account;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "email", length = 64, nullable = false)
    private String email;

    @Column(name = "numphone", length = 10)
    private String numphone;

    @Column(name = "score")
    private int score;

    @Column(name = "winnum")
    private int winnum;

    @Column(name = "lostnum")
    private int lostnum;

    @Column(name = "winstreak")
    private int winstreak;

    @Column(name = "loststreak")
    private int loststreak;

    public Player()
    {
        id = score = winnum = lostnum = winstreak = loststreak = 0;
        account = password = email = numphone = "";
    }

    public int getID()
    {
        return id;
    }
    public void setID(int id)
    {
        this.id = id;
    }

    public String getAccount()
    {
        return account;
    }
    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNumPhone()
    {
        return numphone;
    }
    public void setNumPhone(String numphone)
    {
        this.numphone = numphone;
    }

    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    public int getWinNum()
    {
        return winnum;
    }
    public void setWinNum(int num)
    {
        this.winnum = num;
    }

    public int getLostNum()
    {
        return lostnum;
    }
    public void setLostNum(int num)
    {
        this.lostnum = num;
    }

    public int getWinStreak()
    {
        return winstreak;
    }
    public void setWinStreak(int streak)
    {
        this.winstreak = streak;
    }

    public int getLostStreak()
    {
        return loststreak;
    }
    public void setLostStreak(int streak)
    {
        this.loststreak = streak;
    }

}
