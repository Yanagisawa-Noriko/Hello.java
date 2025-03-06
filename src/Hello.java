import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Hello {
    public static void main(String[] args) {
        // Swingコンポーネントはイベントディスパッチスレッドで実行する
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setSize(200, 100); // サイズ変更
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ウィンドウを閉じたときにアプリケーション終了
            JLabel label = new JLabel("Hello!", JLabel.CENTER); // ラベルを中央に配置
            f.add(label);
            f.setVisible(true);
        });
    }
}