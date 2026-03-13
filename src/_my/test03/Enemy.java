//package _my.test03;
//
//import javax.swing.*;
//
//public class Enemy extends JLabel implements Moveable {
//
//  // 적의 현재 좌표 상태값
//  private int x;
//  private int y;
//
//  // 좌우 방향 이미지
//  ImageIcon enemyL = new ImageIcon("img/enemyL.png");
//  ImageIcon enemyR = new ImageIcon("img/enemyR.png");
//
//  // 속도 상수
//  private final int ENEMY_STEP = 2;
//  private final int DELAY_MS = 50;
//  private final int MAX_X = 1000 - 150;
//  private final int MAX_Y = 600 - 100;
//  private final int MIN_POS = 0;
//
//  Enemy enemy = new Enemy();
//
//
//  public Enemy() {
//    initData();
//    setInitData();
//    addKeyListener();
//    startEnemyThread();
//  }
//
//  @Override
//  public int getX() {
//    return x;
//  }
//
//  public void setX(int x) {
//    this.x = x;
//  }
//
//  @Override
//  public int getY() {
//    return y;
//  }
//
//  public void setY(int y) {
//    this.y = y;
//  }
//
//  private void initData() {
//    new JLabel(enemyR);
//    enemy.setSize(100, 100);
//    enemy.setLocation(100, 500);
//    enemyR = new ImageIcon("img/enemyR.png");
//    enemyL = new ImageIcon("img/enemyL.png");
//  }
//
//
//  private void setInitData() {
//    enemy.setVisible(true);
//  }
//
//  private void addKeyListener() {
//  }
//
//
//  private void startEnemyThread() {
//    Runnable enemyTask = new Runnable() {
//      @Override
//      public void run() {
//        boolean moveR = true;
//        while (true) {
//          int x = enemy.getX();
//
//          if (moveR) {
//            x += ENEMY_STEP;
//            enemy.setIcon(enemyR);
//          } else {
//            x -= ENEMY_STEP;
//            enemy.setIcon(enemyL);
//          }
//          if (x >= 800) {
//            moveR = false;
//          }
//          if (x <= 100) {
//            moveR = true;
//          }
//          enemy.setLocation(x, enemy.y);
//          try {
//            Thread.sleep(DELAY_MS);
//          } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//          }
//        }
//      }
//    };
//        Thread thread = new Thread(enemyTask);
//        thread.start();
//      }
//
//
//
//    @Override
//    public void left () {
//
//    }
//
//    @Override
//    public void right () {
//
//    }
//
//    @Override
//    public void up () {
//
//    }
//
//    @Override
//    public void down () {
//
//    }
//  }
