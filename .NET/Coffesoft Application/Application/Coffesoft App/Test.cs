using DataServices.Connectors;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace App
{
    public partial class Test : Form
    {
        MySQLConnector Connector;
        public Test()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

            Connector = new MySQLConnector("158.85.170.251", "vitibiz_Coffesoft", 3306, "vitibiz_dev", "sena123456789");
            Connector.OpenConnection();
            foreach (var val in Connector.SelectQuery("tbl_test", "var"))
            {
                MessageBox.Show(val);
            }
        }
    }
}
